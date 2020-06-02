package com.example.demomybatis.service.impl;

import com.example.demomybatis.mapper.SysLoginUserMapper;
import com.example.demomybatis.mapper.SysLoginUserMapper2;
import com.example.demomybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    SysLoginUserMapper userDao;
    @Autowired
    SysLoginUserMapper2 userDao2;

    public void test(){
        userDao.updatewechatid(String.valueOf(new Random().nextInt()));
    }

    public void test2(){
        userDao2.updatewechatid(String.valueOf(new Random().nextInt()));
    }
}
