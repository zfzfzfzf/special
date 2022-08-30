package com.tiger.grocery.special.spring.error.aop.aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
@Aspect
@Service
public class AopConfig {
    @Before("execution(* com.tiger.grocery.special.spring.error.aop.aop01.AdminUserService.login(..)) ")
    public void logAdminLogin(JoinPoint pjp) throws Throwable {
        System.out.println("! admin login ...");
    }
}
