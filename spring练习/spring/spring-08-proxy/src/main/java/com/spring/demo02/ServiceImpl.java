package com.spring.demo02;

public class ServiceImpl implements Service {

    @Override
    public void add() {
        System.out.println("Add");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void select() {
        System.out.println("select");
    }

}
