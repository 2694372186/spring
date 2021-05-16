package com.spring.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("通过Mysql获取");
    }
}
