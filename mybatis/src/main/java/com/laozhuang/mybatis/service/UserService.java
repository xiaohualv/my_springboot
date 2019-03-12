package com.laozhuang.mybatis.service;

import com.laozhuang.mybatis.model.User;

import java.util.List;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-03-08 13:55
 **/
public interface UserService {

    List<User> getUserList();

    void addUser(User user);

    void delUser(Integer id);

    void updateUser(Integer id, User user);
}
