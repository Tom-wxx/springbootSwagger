package com.example.springbootswagger.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@RestController
public class SwaggerController {

    @RequestMapping ("/hello")
    public String hello() {
        return "hello:wxx";
    }

    @Bean
    public Docket getDocket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }
    @Bean
    public Docket getDocket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }
    @Bean
    public Docket getDocket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("C");
    }
}
