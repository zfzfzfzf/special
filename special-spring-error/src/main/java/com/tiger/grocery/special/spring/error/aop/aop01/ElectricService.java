package com.tiger.grocery.special.spring.error.aop.aop01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
@Service
public class ElectricService {
    @Autowired
    private AdminUserService adminUserService;

    public void charge() throws Exception {
        System.out.println("Electric charging ...");
        this.pay();
    }

    public void pay() throws Exception {
        adminUserService.login();
        String payNum = adminUserService.getAdminUser().getPayNum();
        System.out.println("User pay num : " + payNum);
        System.out.println("Pay with alipay ...");
        Thread.sleep(1000);
    }
}
