package com.putubgs.DineEasy.model;

public class User {
    private Integer userId;
    private String username;
    private String password;
    private String role;

    public User(Integer userId, String username, String password, String role){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setRole(String role){
        this.role = role;
    }

    public Integer getUserId(){
        return this.userId;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getRole(){
        return this.role;
    }
}
