package com.zy.consumer;


import com.alibaba.fastjson.JSONObject;

import com.tujia.framework.api.APIResponse;
import com.tujia.framework.house.RegionMerchantVo;
import com.tujia.oversea.api.houseimport.HouseUnitService;
import com.tujia.tns.baseinfo.api.service.HouseApiService;
import com.zy.api.bean.Classes;
import com.zy.api.bean.User;
import com.zy.api.member.MemberService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CallTujia {

        public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbo-consumer_tj.xml");
            HouseApiService houseApiService =  app.getBean(HouseApiService.class);

            APIResponse<Long> hotelIdByHouseId = houseApiService.getHotelIdByHouseId(100001);



            System.out.println("houseSearchAPIResponse："+hotelIdByHouseId);
//        MemberServuce
    }
//    ClassPathXmlApplicationContext app;
//    MemberService memberService;
//
//    @BeforeClass
//    public void init() {
//
//        app = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
//        memberService = app.getBean(MemberService.class);
//
//    }
//
//    @Test
//    public void aa() {
//
//        String user = memberService.getUser(1L);
//
//        System.out.println("查询ID返回结果：" + user);
//    }
//
//    @Test
//    public void bb() {
//
//        User user = memberService.queryUserInfo(1);
//
//        System.out.println("查询结果：" + JSONObject.toJSON(user));
//    }
//
//    @Test
//    public void cc() {
//
//        User user = new User();
//        user.setName("郑好");
//        user.setSex("女");
//        user.setAge(0);
//
//
//        Classes classes = new Classes();
//        classes.setClassname("等待 hello world");
//        classes.setGrade("waiting...");
//        classes.setNo("330227");
//        user.setClasses(classes);
//
//
//        user = memberService.setUserInfo(user);
//
//        System.out.println("修改结果：" + JSONObject.toJSON(user));
//    }
}
