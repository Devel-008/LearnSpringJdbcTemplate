package com.practice.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class AnnotationsPostContructPreDestroy {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public AnnotationsPostContructPreDestroy(){
        super();
    }

    @Override
    public String toString() {
        return "AnnotationsPostContructPreDestroy{" +
                "message='" + msg + '\'' +
                '}';
    }
@PostConstruct
    public void start(){
        System.out.println("Starting of Method!");
    }
    @PreDestroy
    public void end(){
        System.out.println("Ending of Method ");
    }
}
