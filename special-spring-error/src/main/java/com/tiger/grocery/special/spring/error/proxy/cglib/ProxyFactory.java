package com.tiger.grocery.special.spring.error.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
public class ProxyFactory<T> implements MethodInterceptor {

    private T target;

    public ProxyFactory(T t){
        this.target=t;
    }

     T getProxyInstance(){
         Enhancer enhancer=new Enhancer();
         enhancer.setSuperclass(target.getClass());
         enhancer.setCallback(this);
         return (T) enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务！");
        Object invoke = method.invoke(target, objects);
        System.out.println("结束事务！");
        return invoke;
    }
}
