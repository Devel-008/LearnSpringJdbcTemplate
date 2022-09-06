package com.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configStandalone.xml");
        StandaloneCollections standaloneCollections = (StandaloneCollections) context.getBean("person1");
        System.out.println(standaloneCollections);
        StandaloneCollections standaloneCollections1 = (StandaloneCollections) context.getBean("person2");
        System.out.println(standaloneCollections1);
    }
}
