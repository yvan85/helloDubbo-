package com.zy.api.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Classes implements Serializable {
    private String classname;
    private String grade;
    private String no;

    @Override
    public String toString() {
        return "Classes{" +
                "classname='" + classname + '\'' +
                ", grade='" + grade + '\'' +
                ", no='" + no + '\'' +
                '}';
    }
}
