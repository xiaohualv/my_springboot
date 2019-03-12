package com.laozhuang.mybatis.dao;

import com.laozhuang.mybatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-03-08 13:57
 **/
public interface UserDao {

    @Select("SELECT * FROM USER")
    List<User> getUserList();

    @Insert("INSERT INTO USER(name,age,phone) VALUES(#{name},#{age},#{phone})")
    void addUser(User user);

    @Delete("delete from user where id = #{id}")
    void delUser(Integer id);

    @Update("update user set name = #{user.name}, age = #{user.age} where id = #{id}")
    void updateUser(@Param("id") Integer id, @Param("user") User user);
}
