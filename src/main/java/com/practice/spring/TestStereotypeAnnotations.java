package com.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotypeAnnotations {
    public static void main(String[] args) {

     //   Scanner sc = new Scanner(System.in);
        ApplicationContext context = new ClassPathXmlApplicationContext("steroconfig.xml ");
        StereotypeAnnotations stereo = context.getBean("obj",StereotypeAnnotations.class);
       /* System.out.println("Enter Name:=");
        stereo.setName(sc.next());
        System.out.println("Enter City:=");
         stereo.setCity(sc.next());
        System.out.println("Enter the no of things in list:=");
        int i=sc.nextInt();
        System.out.println("List:=");
        for(int j=0; j<i ; j++) {
         stereo.setAddress(Collections.singletonList(sc.next()));
        }*/
       // System.out.println(stereo);
        System.out.println(stereo.hashCode());
        StereotypeAnnotations stereo1 = context.getBean("obj",StereotypeAnnotations.class);
        BeanScope beanScope = (BeanScope) context.getBean("tem");
        BeanScope beanScope1 = (BeanScope) context.getBean("tem");
        System.out.println(stereo1.hashCode());
        System.out.println(beanScope.hashCode());
        System.out.println(beanScope1.hashCode());


    }
}
