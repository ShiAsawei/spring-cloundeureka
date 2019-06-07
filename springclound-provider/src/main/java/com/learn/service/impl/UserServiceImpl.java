package com.learn.service.impl;

import com.learn.dao.UserDao;
import com.learn.service.Userservice;

import com.learn.entity.UserInfo ;
import com.learn.springcloundapi.entity.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    private UserDao userDao;
    @Override
    public List<UserInfo> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<com.learn.springcloundapi.entity.UserInfo> UserInfoList() {
        return UserUtils.userInfoList();
    }

}
