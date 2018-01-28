package com.example.zhanglanxin.Eatmate;

/**
 * Created by zhanglanxin on 4/18/17.
 */

public class User {
    private String name;
    private String email;

    public User() { // needed by firebase to create objects
    }

    public User(String username, String email) {
        this. name = username;
        this.email = email;
    }
    public User(String username) {
        this. name = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
