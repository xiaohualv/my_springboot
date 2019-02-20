package com.laozhuang.autoloading.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-02-19 13:49
 **/
@Controller
public class TestController {

    @RequestMapping("/say")
    public String say(Model model){
        model.addAttribute("say","三生三世");
        return "say";
    }
}
