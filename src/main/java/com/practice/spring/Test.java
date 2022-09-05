package com.practice.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("ApllicationContext.xml");

        //1-Class
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
        Student student3 = (Student) context.getBean("student3");
        System.out.println(student3);

        //2-Class
        CollectionTypes collectionTypes = (CollectionTypes) context.getBean("collectible");
        System.out.println(collectionTypes);

        //3-Class
        ReferenceType referenceType = (ReferenceType) context.getBean("a");
        System.out.println(referenceType);

        //4-Class
        ConstructionInjection construct = (ConstructionInjection)  context.getBean("p");
        System.out.println(construct);
        ConstructionInjection construct1 = (ConstructionInjection)  context1.getBean("p1");
        System.out.println(construct1);

        //5-Class
        AmbiguityProblem ambiguityProblem = (AmbiguityProblem) context1.getBean("AM");
        ambiguityProblem.doSum();
        Resource r=new ClassPathResource("ApllicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);
        AmbiguityProblem ambiguityProblem1 = (AmbiguityProblem) factory.getBean("AM");
        ambiguityProblem1.doSum();


    }
}