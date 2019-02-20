package com.thymeleaf.demo.controller;

import com.thymeleaf.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: my_springboot
 * @description: 用户
 * @author: Mr.Zhuang
 * @create: 2019-02-13 18:29
 **/
@Controller
public class UserController {

    @GetMapping("/user")
    public String test(Model model){
        User user = new User();
        user.setName("小牛牛");
        user.setAge(11);

        model.addAttribute("user", user);
        return "user";
    }
}
