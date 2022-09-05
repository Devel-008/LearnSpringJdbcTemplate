package com.practice.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsedByInitDestroy {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        context.registerShutdownHook();
       /* InitDestory obj = (InitDestory) context.getBean("helloWorld");
        obj.getMessage();

        UseInterfaceForInitDestroy obj1 = (UseInterfaceForInitDestroy)
                context.getBean("interface");
        System.out.println(obj1);*/
        AnnotationsPostContructPreDestroy annotate = (AnnotationsPostContructPreDestroy) context.getBean("junction");
        System.out.println(annotate);


    }
}