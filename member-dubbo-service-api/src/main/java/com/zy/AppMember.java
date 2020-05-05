package com.zy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AppMember {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        app.start();

        System.out.println("会员服务启动成功...");

        System.in.read();
    }
}
