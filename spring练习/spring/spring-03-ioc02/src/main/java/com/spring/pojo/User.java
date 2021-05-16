package com.spring.pojo;

public class User {

    private String str;

    public User(String str){
        this.str = str;
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "User{" +
                "str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
