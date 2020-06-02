package com.example.demomybatis;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
//@SpringBootApplication
public class DemoMybatisApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisApplication.class, args);
    }


}
