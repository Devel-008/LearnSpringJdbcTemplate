package com.practice.jdbc;

import java.util.List;
import java.util.Scanner;

public interface StudentDao {
    public int insert(Student student);
    public int update(Student student);
    public Student select(int id);
    public void getStudent(Student student, Scanner sc);
    List<Student> getAllEmployees();
}
