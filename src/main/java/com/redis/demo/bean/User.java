package com.redis.demo.bean;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String name;
    private int age;
    private Date birthday;
    private char gener;
}
