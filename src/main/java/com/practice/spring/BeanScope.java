package com.practice.spring;

public class BeanScope {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "BeanScope{" +
                "name='" + name + '\'' +
                '}';
    }
}
