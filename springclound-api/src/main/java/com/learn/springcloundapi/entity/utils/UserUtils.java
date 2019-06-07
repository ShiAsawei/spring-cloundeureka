package com.learn.springcloundapi.entity.utils;

import com.learn.springcloundapi.entity.UserInfo;

import java.util.ArrayList;
import java.util.List;


public class UserUtils {
    static List li =new ArrayList();
    static   UserInfo user =new UserInfo();

    public static List<UserInfo> userInfoList(){
        hello();

        return li;
    }

    public static void hello(){
        for (int i = 0; i < 5; i++) {
            user.setId(i+1);
            user.setUsername("zhangSan"+i);
            user.setPassword("1234"+i);
            li.add(user);
        }
        System.out.println("ddd");
    }
}
