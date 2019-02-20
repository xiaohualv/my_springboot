package com.springboot.hello.controller;

import com.springboot.hello.config.ConfigBean;
import com.springboot.hello.config.PropertyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-02-14 15:22
 **/
@RestController
public class HelloController {

    @Autowired
    ConfigBean configBean;

    @Autowired
    PropertyBean propertyBean;


    @Value("${com.laozhuang.name}")
    private String name;

    @Value("${com.laozhuang.age}")
    private int age;

    @RequestMapping("/hello")
    public String hello(){
        return String.format("hello,%s,让我偷偷看你的年龄:%s",name, age);
    }

    @RequestMapping("/say")
    public String say(){
        return String.format("hello,%s，我的爱好是：%s,我的电话是：%s",
                name,
                configBean.getHobby(),
                configBean.getPhone());
    }

    @RequestMapping("/good")
    public String good(){
        return String.format("hello,%s，我是个好：%s",
                propertyBean.getName(),
                propertyBean.getSex());
    }
}
