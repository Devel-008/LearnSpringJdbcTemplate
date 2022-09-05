package com.practice.spring;

public class Student {
    private int id;
    private String sName;
    private String sAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        //System.out.println("Setting id");
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
       // System.out.println("Setting name");
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
       // System.out.println("Setting Address");
    }
    public Student(int id, String sName, String sAddress) {
        this.id = id;
        this.sName = sName;
        this.sAddress = sAddress;
    }
    public Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }

}
