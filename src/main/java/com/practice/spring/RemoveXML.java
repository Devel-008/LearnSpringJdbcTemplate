package com.practice.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class RemoveXML  {
    @Value("#{34}")
    private int h;
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }

    public void study(){
        System.out.println("STUDY");
    }
    @Override
    public String toString() {
        return "RemoveXML{" +
                "h=" + h +
                '}';
    }
}
