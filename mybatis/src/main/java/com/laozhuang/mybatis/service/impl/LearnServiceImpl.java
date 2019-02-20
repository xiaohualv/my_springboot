package com.laozhuang.mybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.laozhuang.mybatis.dao.LearnDao;
import com.laozhuang.mybatis.model.LearnResouce;
import com.laozhuang.mybatis.service.LearnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-02-19 18:31
 **/
@Service("learnService")
public class LearnServiceImpl implements LearnService {

    @Resource
    private LearnDao learnDao;

    @Override
    public PageInfo<LearnResouce> getLearnList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo(learnDao.getLearnList());
        return pageInfo;
    }

    @Override
    public LearnResouce getLearnByName(String name) {
        return learnDao.getLearnByName(name);
    }
}
