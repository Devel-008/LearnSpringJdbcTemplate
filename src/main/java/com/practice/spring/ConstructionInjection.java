package com.practice.spring;

import java.util.List;

public class ConstructionInjection {
    private String name;
    private int id;
    private Certificate certificate;
 //   private List<String> places;

    public ConstructionInjection(String name, int id, Certificate certificate){
        super();
        this.name=name;
        this.id=id;
        this.certificate=certificate;
       // this.places=places;
    }

    @Override
    public String toString() {
        return "ConstructionInjection{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", certificate=" + certificate +
                '}';
    }
}
