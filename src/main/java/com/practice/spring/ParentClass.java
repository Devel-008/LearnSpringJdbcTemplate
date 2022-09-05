package com.practice.spring;

public class ParentClass {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ParentClass() {
        super();
    }

    public ParentClass(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "y=" + y +
                '}';
    }
}
