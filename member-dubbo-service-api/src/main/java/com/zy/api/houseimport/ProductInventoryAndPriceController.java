//package com.zy.api.houseimport;
//
//import com.tujia.framework.api.APIResponse;
//import com.tujia.framework.datetime.bean.ShortDate;
//import com.tujia.tns.product.api.service.ProductForOpenPriceService;
//import com.tujia.tns.product.provider.vo.GetProductInventoryAndPriceRealInfoRequest;
//import com.tujia.tns.product.provider.vo.ProductInventoryAndPriceInfo;
//import lombok.extern.slf4j.Slf4j;
//
//import javax.annotation.Resource;
//
///**
// * @description:
// * @author: fmy
// * @date: 2020-02-17 19:20.
// */
//@Slf4j
//@RestController
//public class ProductInventoryAndPriceController {
//    @Resource(name = "productForOpenPriceServiceT1")
//    private ProductForOpenPriceService productForOpenPriceServiceT1;
//
//    @Resource(name = "productForOpenPriceServiceT2")
//    private ProductForOpenPriceService productForOpenPriceServiceT2;
//
//    @Resource(name = "productForOpenPriceService")
//    private ProductForOpenPriceService productForOpenPriceServiceFvt;
//
//    /**
//     * 查询产品价格库存实时信息。
//     *
//     * 注：
//     *      之所以会有这个接口的出现，原因如下：
//     *          1. 报价后门删除，没有http接口来查询价格库存实时信息
//     *          2. 自动化平台直接调该dubbo接口，由于接口入参包含ShortDate类型，反解析不出来，调用失败，
//     *      因此通过该http接口做一个中转
//     *
//     * @param unitId
//     * @param productId
//     * @param checkInDate
//     * @param checkOutDate
//     * @param env
//     * @return
//     */
//    @RequestMapping("/provider/thirdpart/getRealTimeProductInfo.htm")
//    public APIResponse<ProductInventoryAndPriceInfo> changeResultData(@RequestParam long unitId,
//                                   @RequestParam long productId,
//                                   @RequestParam String checkInDate,
//                                   @RequestParam String checkOutDate,
//                                   @RequestHeader(name = "atlantisEnv", defaultValue = "t1") String env) {
//        GetProductInventoryAndPriceRealInfoRequest realInfoRequest = new GetProductInventoryAndPriceRealInfoRequest();
//        realInfoRequest.setUnitId(unitId);
//        realInfoRequest.setProductId(productId);
//        realInfoRequest.setStartDate(ShortDate.valueOf(checkInDate));
//        realInfoRequest.setEndDate(ShortDate.valueOf(checkOutDate));
//
//        APIResponse<ProductInventoryAndPriceInfo> dubboResponse = null;
//        switch (env.toLowerCase()) {
//            case "t1":
//                dubboResponse = productForOpenPriceServiceT1.getProductInventoryAndPriceRealInfoV1(realInfoRequest);
//                break;
//            case "t2":
//                dubboResponse = productForOpenPriceServiceT2.getProductInventoryAndPriceRealInfoV1(realInfoRequest);
//                break;
//            case "fvt":
//                dubboResponse = productForOpenPriceServiceFvt.getProductInventoryAndPriceRealInfoV1(realInfoRequest);
//                break;
//        }
//
//        return dubboResponse;
//    }
//}
