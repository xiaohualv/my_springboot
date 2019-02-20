package com.laozhuang.mybatis.service;

import com.github.pagehelper.PageInfo;
import com.laozhuang.mybatis.model.LearnResouce;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-02-19 18:29
 **/
public interface LearnService {

     PageInfo<LearnResouce> getLearnList(int pageNum, int pageSize);

    LearnResouce getLearnByName(String name);
}
