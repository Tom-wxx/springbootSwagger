package com.example.springbootswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration //声明该类是一个配置类
@EnableSwagger2 //开启swagger
public class SwaggerConfig {
    /**
     * 创建Docket的bean实例对象
     * @return
     */
    @Bean  //Swagger的使用主要是要将docket对象传入IOC容器
    public Docket getDocket(){
        return new Docket
                (new DocumentationType("swagger", "2.0"))
                .groupName("测试hello")
                .apiInfo(getApiInfo())  // 接口文档相关信息
                //RequestHandlerSelectors.basePackage指定要扫描的包
                //RequestHandlerSelectors.any()扫描所有包
                //RequestHandlerSelectors.none()任何包都不扫描
                //RequestHandlerSelectors.withMethodAnnotation()扫描方法上的指定注解
                //RequestHandlerSelectors.withMethodAnnotation()扫描类上的指定注解
                .select().apis(RequestHandlerSelectors.basePackage("com.swagger.controller"))
                //配置要拦截的路径，any:拦截所有，ant:拦截指定路径，none,都不拦截
                .paths(PathSelectors.any())
                .build();
    }
    public ApiInfo getApiInfo(){
        //作者信息
        Contact DEFAULT_CONTACT = new Contact("hello", "https://www.baidu.com/", "213233945@qq.com"); //个人的联系方式
        return  new ApiInfo(
                "项目文档测试", //标题
                "这是一个swagger项目文档接口", //描述
                "1.0.0", //版本
                "https://www.baidu.com/", //项目地址
                DEFAULT_CONTACT, //作者信息
                "Apache 2.0", //许可
                "http://www.apache.org/licenses/LICENSE-2.0", //许可证网址
                new ArrayList<>());// 扩展
    }

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo());
    }

}
