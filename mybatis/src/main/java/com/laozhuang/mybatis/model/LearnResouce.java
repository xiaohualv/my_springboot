package com.laozhuang.mybatis.model;

import lombok.Data;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-02-19 18:23
 **/
@Data
public class LearnResouce {
    private Long id;
    private String author;
    private String title;
    private String url;
}
