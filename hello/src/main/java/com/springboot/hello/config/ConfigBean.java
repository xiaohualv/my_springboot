package com.springboot.hello.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-02-14 17:16
 **/
@Configuration
@ConfigurationProperties(prefix = "com.laozhuang")
public class ConfigBean {

    private String phone = "15321312508";

    private String hobby = "自由与美人";

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
