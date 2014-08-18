package com.lorren.springmvc.vo;

public class UserVO {
    private String username;
    private String password;

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
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserVO [username=");
        builder.append(username);
        builder.append(", password=");
        builder.append(password);
        builder.append("]");
        return builder.toString();
    }
     
}