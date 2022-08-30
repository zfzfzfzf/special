package com.tiger.grocery.special.spring.error.aop.aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
@Aspect
@Service
public class AopConfig2 {
    @Before("execution(* com.tiger.grocery.special.spring.error.aop.aop02.ElectricService2.charge()) ")
    public void checkAuthority(JoinPoint pjp) throws Throwable {
        System.out.println("validating user authority");
        Thread.sleep(1000);
    }

    @Around("execution(* com.tiger.grocery.special.spring.error.aop.aop02.ElectricService2.doCharge()) ")
    public void recordPerformance(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        pjp.proceed();
        long end = System.currentTimeMillis();
        System.out.println("charge method time cost: " + (end - start));
    }
}
