package com.practice.spring;

public class ReferenceType {
    private int x;
    private ParentClass obj;

    public ReferenceType() {
      super();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public ParentClass getObj() {
        return obj;
    }

    public void setObj(ParentClass obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ReferenceType{" +
                "x=" + x +
                ", obj=" + obj +
                '}';
    }
}
