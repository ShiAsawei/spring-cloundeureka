package com.learn.springcloundapi.entity;

//import lombok.Data;
//import lombok.experimental.Accessors;
//
import java.io.Serializable;
//@SuppressWarnings("serial")
//@Data
//@Accessors(chain = true)//如果设置为true,没有任何类被@Accessors注解，
//// 或者有类被注解但是没有为chain参数显式赋值，
//// 则表现为@Accessors(chain=true)
public class UserInfo implements Serializable {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo() {
    }

    public UserInfo(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
