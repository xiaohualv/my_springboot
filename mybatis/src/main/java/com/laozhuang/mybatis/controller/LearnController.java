package com.laozhuang.mybatis.controller;

import com.github.pagehelper.PageInfo;
import com.laozhuang.mybatis.model.LearnResouce;
import com.laozhuang.mybatis.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-02-19 18:24
 **/
@RestController
public class LearnController {

    @Autowired
    private LearnService learnService;

    /** 
    * @Description: 带分页查询 
    * @Param: [pageNum：第几页, pageSize：每页条数]
    * @return: com.github.pagehelper.PageInfo
    * @Author: Mr.Zhuang 
    * @Date: 2019/2/20 
    */ 
    @GetMapping("/list")
    public PageInfo<LearnResouce> getLearnList(
            @RequestParam(name="pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(name="pageSize", required = false, defaultValue = "2") int pageSize){
        return learnService.getLearnList(pageNum, pageSize);
    }

    @GetMapping("/name")
    public LearnResouce getLearnByName(String name){
        return learnService.getLearnByName(name);
    }
}
