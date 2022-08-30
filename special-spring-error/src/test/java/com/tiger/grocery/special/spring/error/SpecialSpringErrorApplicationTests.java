package com.tiger.grocery.special.spring.error;

import com.tiger.grocery.special.spring.error.aop.aop01.ElectricService;
import com.tiger.grocery.special.spring.error.aop.aop02.ElectricService2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpecialSpringErrorApplicationTests {

    @Resource
    private ElectricService electricService;

    @Resource
    private ElectricService2 electricService2;

    @Test
    void contextLoads() throws Exception{
        electricService.charge();
    }



    @Test
    void testCharge(){
        electricService2.charge();
    }

}
