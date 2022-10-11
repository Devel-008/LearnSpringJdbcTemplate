package com.practice.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentDaoImplement implements StudentDao{
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String insertQuery = "insert into human values(?,?)";
        int i = this.jdbcTemplate.update(insertQuery,student.getId(),student.getName());

        if(i > 0){
            System.out.println("Inserted!!!!!");
        }else{
            System.out.println("Failed to Insert!!!");
        }
        return 0;
    }

    @Override
    public int update(Student student) {
        String updateQuery = "update human set name = ? where id = ?";
       int i =  this.jdbcTemplate.update(updateQuery,student.getName(),student.getId());
       if(i>0){
           System.out.println("Updated");
       }else{
           System.out.println("Failed to update!!");
       }
        return 0;
    }

    @Override
    public Student select(int id) {
        String selectQuery = "select * from human where id = ?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(selectQuery,rowMapper, id);
        return student;
    }

    @Override
    public void getStudent(Student student, Scanner sc) {
        System.out.println("Enter id:-");
        student.setId(sc.nextInt());
        Student student1 = select(student.getId());
        System.out.println(student1);
    }

    public List<Student> getAllEmployees(){
        return jdbcTemplate.query("select * from human", rs -> {
            List<Student> list= new ArrayList<>();
            while(rs.next()){
                Student e=new Student();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                list.add(e);
            }
            return list;
        });
    }
}
