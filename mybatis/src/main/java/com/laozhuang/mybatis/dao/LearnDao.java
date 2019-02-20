package com.laozhuang.mybatis.dao;

import com.laozhuang.mybatis.model.LearnResouce;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-02-19 18:33
 **/
public interface LearnDao {

    /**
    * @Description: 查询所有
    * @Param: []
    * @return: java.util.List<com.laozhuang.mybatis.model.LearnResouce>
    * @Author: Mr.Zhuang
    * @Date: 2019/2/20
    */
    @Results({
        @Result(property = "author", column = "author_name")
    })
    @Select("select * from learn_resource")
    List<LearnResouce> getLearnList();


    /** 
    * @Description: 通过名字查找
    * @Param: [name] 
    * @return: com.laozhuang.mybatis.model.LearnResouce 
    * @Author: Mr.Zhuang 
    * @Date: 2019/2/20 
    */
    @Results({
            @Result(property = "author", column = "author_name")
    })
//    @SelectProvider(type = LearnSelectProvider.class, method = "getLearnByName")
    @Select("SELECT * FROM learn_resource WHERE author_name = #{name} ")
    LearnResouce getLearnByName(@Param("name") String name);
}
