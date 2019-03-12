package com.laozhuang.mybatis.config;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @program: my_springboot
 * @description:Swagger2配置类
 * @author: Mr.Zhuang
 * @create: 2019-03-08 15:39
 **/
//@Configuration
//@EnableSwagger2
public class Swagger2 {

    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.laozhuang.mybatis"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("你是骏马，是骏马呦")
                .termsOfServiceUrl("http:www.baidu.com")
                .contact("喂马")
                .version("1.0")
                .build();
    }
}
