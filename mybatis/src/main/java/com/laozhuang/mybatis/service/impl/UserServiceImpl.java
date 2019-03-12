package com.laozhuang.mybatis.service.impl;

import com.laozhuang.mybatis.dao.UserDao;
import com.laozhuang.mybatis.model.User;
import com.laozhuang.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-03-08 13:56
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public void addUser(User user) {
         userDao.addUser(user);
    }

    @Override
    public void delUser(Integer id) {
         userDao.delUser(id);
    }

    @Override
    public void updateUser(Integer id, User user) {
        userDao.updateUser(id, user);
    }
}
