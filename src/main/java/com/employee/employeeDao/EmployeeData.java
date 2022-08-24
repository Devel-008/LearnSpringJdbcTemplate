package com.employee.employeeDao;

public class EmployeeData
{
    private int id;
    private String name;
    private float salary;

    public EmployeeData(int id, String name, float salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public EmployeeData() {

    }

    public EmployeeData(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
