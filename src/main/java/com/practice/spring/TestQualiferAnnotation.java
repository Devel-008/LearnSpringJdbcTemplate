package com.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQualiferAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("qualifierConfig.xml");
        QualiferAnnotation autoWiring = applicationContext.getBean("emp",QualiferAnnotation.class);
        System.out.println(autoWiring) ;
    }
}
