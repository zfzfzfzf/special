package com.tiger.grocery.special.spring.error.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
public class JavaReflect {

    public static void main(String[] args) throws  Exception{
//        Student student=new Student();
//        Class<? extends Student> aClass1 = student.getClass();
//        Class<Student> studentClass = Student.class;
        Class<?> aClass = Class.forName("com.tiger.grocery.special.spring.error.reflect.Student");
        name(aClass);
        field(aClass);
        method(aClass);


    }

    private static void name(Class aClass){
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
    }

    private static void  field(Class aClass)throws Exception{
        Field[] fields = aClass.getFields();
        for (Field field:fields){
            System.out.println("field:"+  field.getName());
            if("userName".equalsIgnoreCase(field.getName())){
                Object obj = aClass.newInstance();
                field.set(obj,"zhangfeng");
                System.out.println(field.get(obj));
            }
        }
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field:declaredFields){
            System.out.println("declaredFields:"+ field.getName());
            if("age".equalsIgnoreCase(field.getName())){
                Object obj = aClass.newInstance();
                //私有属性被实用，设置true
                field.setAccessible(true);
                field.set(obj,18);
                System.out.println(field.get(obj));
            }
        }
    }

    private static void method(Class aClass)throws Exception{
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method:declaredMethods){
            System.out.println("declaredMethod->"+method.getName());
            if("buildPrivate".equalsIgnoreCase(method.getName())){
                //私有方法，设置true
                method.setAccessible(true);
                Object obj = aClass.newInstance();
                Object result = method.invoke(obj, "zhangfeng");
                System.out.println("buildPrivate-->result->"+result);
            }
        }
    }
}
