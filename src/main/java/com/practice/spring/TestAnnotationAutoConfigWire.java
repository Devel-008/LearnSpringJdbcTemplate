package com.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationAutoConfigWire { public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnotationAutoWire.xml");
    AnnotationAutoWire autoWiring = applicationContext.getBean("emp",AnnotationAutoWire.class);
    System.out.println(autoWiring) ;
}
}
