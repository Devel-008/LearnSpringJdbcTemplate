package com.practice.spring;

public class AutoWiring {
    private AutoWiring1 auto;
    public AutoWiring1 getAuto() {
        return auto;
    }

    public void setAuto(AutoWiring1 auto) {
        this.auto = auto;
    }

    public AutoWiring(){
        super();
    }

    public AutoWiring(AutoWiring1 auto) {
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
