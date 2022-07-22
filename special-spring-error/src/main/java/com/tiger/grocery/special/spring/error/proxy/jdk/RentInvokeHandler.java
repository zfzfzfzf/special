package com.tiger.grocery.special.spring.error.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
public class RentInvokeHandler<T> implements InvocationHandler {

    private T target;

    public RentInvokeHandler(T t){
        this.target=t;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("租客和中介讨价还价");
       return method.invoke(target,args);
    }
}
