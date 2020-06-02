package com.example.demomybatis.controller;


import com.example.demomybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("hello")
    public String test(){
        testService.test();
        return "hello";
    }

    @GetMapping("hello2")
    public String test2(){
        testService.test2();
        return "hello2";
    }
}
