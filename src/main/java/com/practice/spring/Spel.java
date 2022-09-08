package com.practice.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Spel {
    @Value("#{22+11}")
    private int x;
    @Value("#{2211}")
    private int y;
    @Value("#{ T(java.lang.Math).sqrt(25)}")
    private double z;
    @Value("#{ T(java.lang.Math).PI }")
    private double e;
    @Value("#{ new java.lang.String('HELLO') }")
    private String name;
    @Value("#{8-9>3}")
    private boolean binary;

    public double getE() {
        return e;
    }
    public void setE(double e) {
        this.e = e;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Spel{" +
                " x = " + x +
                ", \ny = " + y +
                ", \nz = " + z +", \ne = " + e +", \nname = "+name+", \nbinary = "+binary+
                '}';
    }
}
