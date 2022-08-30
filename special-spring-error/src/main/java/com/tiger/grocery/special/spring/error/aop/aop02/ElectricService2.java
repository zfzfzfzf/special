package com.tiger.grocery.special.spring.error.aop.aop02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
@Service
public class ElectricService2 {

    @Lazy
    @Autowired
    private ElectricService2 electricService2;

    public void charge() {
        electricService2.doCharge();
//        SysUserServiceImpl  userService= SpringContextHolder.getBean(SysUserServiceImpl .class)

    }
    public void doCharge() {
        System.out.println("Electric charging ...");
    }
}
