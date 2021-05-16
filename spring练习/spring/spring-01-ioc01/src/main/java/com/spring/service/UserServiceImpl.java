package com.spring.service;

import com.spring.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
