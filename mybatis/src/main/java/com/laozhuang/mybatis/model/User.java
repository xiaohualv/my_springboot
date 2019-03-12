package com.laozhuang.mybatis.model;

import lombok.Data;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-03-08 13:47
 **/
@Data
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private String phone;
}
