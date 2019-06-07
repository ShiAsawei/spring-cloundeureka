package com.learn.service;



import com.learn.entity.UserInfo ;

import java.util.List;

public interface Userservice {

    List<UserInfo> findAll();
    List<com.learn.springcloundapi.entity.UserInfo> UserInfoList();
}
