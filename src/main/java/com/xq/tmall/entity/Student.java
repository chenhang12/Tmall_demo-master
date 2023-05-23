package com.xq.tmall.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
//使用lombok插件并且使用@Data注解可以提供set,get,equals,hashcode，toString等方法
public class Student implements Serializable {
    private Integer id;
    private String name;
    private  Double score;
    private  Date birthday;
}
