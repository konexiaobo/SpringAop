package com.ding.aop;

import com.ding.aop.ProxyInvocation;
import com.ding.aop.UserService;
import com.ding.aop.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args){
        //定义一个真实的用户
        UserServiceImpl userService = new UserServiceImpl();

        //定义代理的角色
        ProxyInvocation pih = new ProxyInvocation();

        //给角色一个真实的永固
        pih.setTarget(userService);

        //根据角色生成一个代理对象
        UserService proxy= (UserService) pih.getProxy();

        //让代理对象去执行方法
        proxy.add();
    }
}
