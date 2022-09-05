package com.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoconfig.xml");
        AutoWiring autoWiring = applicationContext.getBean("emp",AutoWiring.class);
        System.out.println(autoWiring) ;
    }
}
