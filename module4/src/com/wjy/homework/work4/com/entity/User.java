package com.wjy.homework.work4.com.entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 8032972874608965191L;
    private String username;   //用户名
    private String password;   //密码
    //get和set方法

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

//    构造方法

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
