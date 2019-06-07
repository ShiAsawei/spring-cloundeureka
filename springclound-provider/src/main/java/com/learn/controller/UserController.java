package com.learn.controller;


import com.learn.service.Userservice;
import com.learn.entity.UserInfo ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private Userservice userservice;

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public List<UserInfo> findAll(){
        List<UserInfo> list =userservice.findAll();
        logger.info("userinfo: "+list.toString());
        return list;
    }

    @RequestMapping(value = "/user", method= RequestMethod.GET)
    public List<com.learn.springcloundapi.entity.UserInfo> userInfoList(){
        List<com.learn.springcloundapi.entity.UserInfo> list =userservice.UserInfoList();
        logger.info("user: "+list.toString());
        return list;
    }
}
