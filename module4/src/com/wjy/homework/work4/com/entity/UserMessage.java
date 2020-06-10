package com.wjy.homework.work4.com.entity;

import java.io.Serializable;

public class UserMessage implements Serializable {
    private static final long serialVersionUID = 4286409127689413378L;
    private User user;     //User对象
    private String message;  //发挥类型

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserMessage( String message,User user) {
        this.user = user;
        this.message = message;
    }
}
