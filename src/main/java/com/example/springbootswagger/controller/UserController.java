package com.example.springbootswagger.controller;

import com.example.springbootswagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户控制器")
public class UserController {



    //只要接口返回了实体类 swagger就会有显示

    @ApiOperation("得到一个user")
    @PostMapping("/getUser")
    public User getUser(){
        return new User(1,"wang",21);
    }

    @ApiOperation("得到一个userName")
    @GetMapping("/getName")
    public String  getName(String name){
        return name;
    }
    @ApiOperation("返回测试视图")
    @PostMapping("topage")
    public String toPage(){
        return "test";
    }
}
