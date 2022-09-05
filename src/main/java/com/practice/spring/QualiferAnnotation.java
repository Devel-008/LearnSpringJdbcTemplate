package com.practice.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QualiferAnnotation {
    @Autowired
    @Qualifier("auto2")
    private AutoWiring1 auto;
    public AutoWiring1 getAuto() {
        return auto;
    }

    public void setAuto(AutoWiring1 auto) {
        this.auto = auto;
        System.out.println("SETTER injection ");
    }

    public QualiferAnnotation(){
        super();
    }

     public QualiferAnnotation(AutoWiring1 auto) {
        super();
        this.auto = auto;
        System.out.println("Constructor Called");
    }


    @Override
    public String toString() {
        return "AutoWiring{" +
                "auto=" + auto +
                '}';
    }
}
