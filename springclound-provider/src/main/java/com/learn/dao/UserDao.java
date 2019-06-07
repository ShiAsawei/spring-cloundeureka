package com.learn.dao;

import com.learn.entity.UserInfo ;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


import java.util.List;

@Mapper

public interface UserDao {
    List<UserInfo> findAll();
}
