package com.laozhuang.mybatis.controller;

import com.laozhuang.mybatis.model.User;
import com.laozhuang.mybatis.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: my_springboot
 * @description: 测试RESTful API
 * @author: Mr.Zhuang
 * @create: 2019-03-08 13:49
 **/
@RestController
@RequestMapping("/users")
public class UserController {

    @Resource(name="userServiceImpl")
    private UserService userService;


    @ApiOperation(value = "获取用户列表", notes = "所有的用户")
    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @ApiOperation(value = "添加一个用户")
    @RequestMapping(value="/", method = RequestMethod.POST)
    public void addUser(User user){
         userService.addUser(user);
    }

    @ApiOperation(value = "通过ID删除用户", notes = "参数在请求路径中")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void delUser(@PathVariable Integer id){
         userService.delUser(id);
    }


    @ApiOperation(value = "更新用户", notes = "通过ID更新一个用户")
    @ApiImplicitParam(name="id", value = "用户ID", required = true, dataType = "Integer")
    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public void updateUser(@PathVariable("id") Integer id, User user){
        userService.updateUser(id, user);
    }


}
