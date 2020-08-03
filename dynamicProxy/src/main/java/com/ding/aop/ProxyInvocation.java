package com.ding.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocation implements InvocationHandler {

    //要代理的接口
    private Object target;

    //设置接口


    public void setTarget(Object target) {
        this.target = target;
    }

    //根据设置的接口获取代理的对象
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log("invoke target method");
        return method.invoke(target, args);
    }

    private void log(String msg) {
        System.out.println(msg);
    }
}