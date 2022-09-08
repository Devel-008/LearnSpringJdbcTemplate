package com.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpel {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configurationspel.xml");

        Spel spel = (Spel) context.getBean("spel",Spel.class);
        System.out.println(spel);

        SpelExpressionParser temp = new SpelExpressionParser();

        Expression exp = temp.parseExpression("22/1");
        System.out.println("ExpressionValue = "+exp.getValue());
    }
}
