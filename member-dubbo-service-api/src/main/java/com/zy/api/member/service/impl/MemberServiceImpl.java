package com.zy.api.member.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zy.api.bean.Classes;


import com.zy.api.bean.User;
import com.zy.api.member.MemberService;
import io.netty.handler.codec.json.JsonObjectDecoder;

import java.io.Serializable;

public class MemberServiceImpl implements MemberService {

    public String getUser(Long userId) {
        System.out.println("会员服务" + userId);
        return "会员服务的返回" + userId;
    }

    public User queryUserInfo(int userid) {
        User user = new User();
        user.setName("郑一");
        user.setSex("男");
        user.setAge(17);

        Classes classes = new Classes();
        classes.setClassname("二年一班");
        classes.setGrade("二年级");
        classes.setNo("201");

        user.setClasses(classes);

        return user;
    }

    public User setUserInfo(User user) {
//        User user1 = new User();
        user.setName("改："+user.getName());
        user.setSex("改："+user.getSex());
        user.getClasses().setClassname("改："+user.getClasses().getClassname());
        user.getClasses().setGrade("改："+user.getClasses().getGrade());

//        System.out.println(JSONObject.toJSON(user1));
        return user;

    }
}
