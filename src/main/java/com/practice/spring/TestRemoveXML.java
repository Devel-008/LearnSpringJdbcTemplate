package com.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRemoveXML {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        RemoveXML xml = (RemoveXML) context.getBean("getXML",RemoveXML.class);
        System.out.println(xml);
        xml.study();
    }
}
