package com.practice.spring;

import java.util.List;

public class Certificate {
    private String name;
    private List<String> places;
    public Certificate(String name,List<String > places) {
        super();
        this.name = name;
        this.places=places;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "name='" + name + '\'' +
                ", places=" + places +
                '}';
    }
}
