package com.tiger.grocery.special.spring.error.aop.aop01;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
public class Test {
    public static void main(String[] args)throws Exception {

        ElectricService electricService=new ElectricService();
        electricService.charge();
    }
}
