package com.tiger.grocery.special.spring.error.aop.aop01;

import org.springframework.stereotype.Service;


/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
@Service
public class AdminUserService {
    public final User adminUser = new User("202101166");

    public void login() {
        System.out.println("admin user login...");
    }

    public User getAdminUser(){
        return adminUser;
    }
}
