package com.laozhuang.mybatis.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LearnControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getLearnByName() throws Exception {

        String url = "/list";

        /* 构建request 发送请求GET请求
         * MockMvcRequestBuilders 中有很多 请求方式。像get、post、put、delete等等
         */
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(url)
                .accept(MediaType.APPLICATION_JSON)) // 断言返回结果是json
                .andReturn();// 得到返回结果

        System.out.println("结果集……："+mvcResult);
        MockHttpServletResponse response = mvcResult.getResponse();
        System.out.println("返回请求……"+response);
        int statusCode = response.getStatus();
        System.out.println("状态码："+statusCode);
        String content = response.getContentAsString();
        System.out.println("内容为："+content);
    }
}