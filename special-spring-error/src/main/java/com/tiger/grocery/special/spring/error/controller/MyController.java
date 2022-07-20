package com.tiger.grocery.special.spring.error.controller;

/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MyController {

    @RequestMapping("/helloWord")
    public String Hello(){

        return "Hello Word";
    }
}
