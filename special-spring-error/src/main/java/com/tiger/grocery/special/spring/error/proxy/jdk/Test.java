package com.tiger.grocery.special.spring.error.proxy.jdk;

import java.lang.reflect.Proxy;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
public class Test {
    public static void main(String[] args) {

        Person person=new StudentPerson();
        RentInvokeHandler invokeHandler=new RentInvokeHandler(person);

        Person proxyPerson = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, invokeHandler);
        proxyPerson.rentHouse();

    }
}
