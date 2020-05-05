package com.zy.api.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {


    private String name;
    private String sex;
    private int age;
    private Classes classes;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                '}';
    }
}
