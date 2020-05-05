package com.zy.consumer;


import com.zy.api.bean.Classes;
import com.zy.api.bean.User;
import com.zy.api.member.MemberService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.alibaba.fastjson.JSONObject;

public class OrderToMember {

    //    public static void main(String[] args) {
//        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
//      MemberService memberService =  app.getBean(MemberService.class);
//    String user =  memberService.getUser(1L);
//
//
//        System.out.println("订单服务调用会员服务返回结果："+user);
////        MemberServuce
//    }
    ClassPathXmlApplicationContext app;
    MemberService memberService;

    @BeforeClass
    public void init() {

        app = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        memberService = app.getBean(MemberService.class);

    }

    @Test
    public void aa() {

        String user = memberService.getUser(1L);

        System.out.println("查询ID返回结果：" + user);
    }

    @Test
    public void bb() {

        User user = memberService.queryUserInfo(1);

        System.out.println("查询结果：" + JSONObject.toJSON(user));
    }

    @Test
    public void cc() {

        User user = new User();
        user.setName("郑好");
        user.setSex("女");
        user.setAge(0);


        Classes classes = new Classes();
        classes.setClassname("等待 hello world");
        classes.setGrade("waiting...");
        classes.setNo("330227");
        user.setClasses(classes);


        user = memberService.setUserInfo(user);

        System.out.println("修改结果：" + JSONObject.toJSON(user));
    }
}
