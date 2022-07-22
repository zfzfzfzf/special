package com.tiger.grocery.special.spring.error.proxy.cglib;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
public class Test {
    public static void main(String[] args) {
        StudentService studentService=new StudentService();
        StudentService proxyInstance=new ProxyFactory<StudentService>(studentService).getProxyInstance();
        proxyInstance.startLearn();
    }
}
