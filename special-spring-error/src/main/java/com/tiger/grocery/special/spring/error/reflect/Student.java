package com.tiger.grocery.special.spring.error.reflect;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
public class Student {

    public String userName;
    private int age;

   private String buildPrivate(String param){
       return "私有方法:"+param;
   }

   public String buildPublic(String param){
       return "公共方法:"+param;
   }
}
