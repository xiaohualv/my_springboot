package com.laozhuang.mybatis.dao;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-02-20 17:26
 **/
public class LearnSelectProvider {

    public String getLearnByName(String name){
        return "SELECT * FROM learn_resource WHERE author_name = #{name} ";
    }
}
