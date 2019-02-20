package com.laozhuang.webmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: my_springboot
 * @description:
 * @author: Mr.Zhuang
 * @create: 2019-02-18 10:50
 **/
@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {

    /** 
    * @Description: 配置静态访问资源
    * @Param: [registry] 
    * @return: void 
    * @Author: Mr.Zhuang 
    * @Date: 2019/2/18 
    */ 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/my/**")
                .addResourceLocations("classpath:/my/");
    }

    /** 
    * @Description: 页面跳转
    * @Param: [registry] 
    * @return: void 
    * @Author: Mr.Zhuang 
    * @Date: 2019/2/18 
    */ 
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toLogin")
                .setViewName("login");
    }

    @Bean
    public MyHandlerInterceptor myHandlerInterceptor(){
        return new MyHandlerInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/toLogin");
    }
}
