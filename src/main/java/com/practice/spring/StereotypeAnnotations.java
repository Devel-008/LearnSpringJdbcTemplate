package com.practice.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("obj")
@Scope("prototype")  
public class StereotypeAnnotations {
    @Value("Kim")
    private String name;
    @Value("Jurick")
    private String city;
    @Value("#{temp}")
    private List<String> address;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "StereotypeAnnotations{" +
                "name='" + name + '\'' +
                ", \ncity='" + city + '\'' +
                ", \naddress=" + address +
                '}';
    }
}
