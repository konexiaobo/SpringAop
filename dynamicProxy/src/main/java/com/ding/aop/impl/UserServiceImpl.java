package com.ding.aop.impl;

import com.ding.aop.UserService;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add a user");
    }

    @Override
    public void delete() {
        System.out.println("delete a user");
    }

    @Override
    public void update() {
        System.out.println("update a user");
    }

    @Override
    public void select() {
        System.out.println("select a user");
    }
}
