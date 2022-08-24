package com.employee.employeeDao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;
    private static final String insertQuery = "insert into employee(id,emp_name,salary) values(?,?,?)";
    private static final String updateQuery = "update employee set emp_name=?,salary=? where id=?";
    private  static final String deleteQuery = "delete from employee where id=?";
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int saveEmployee(EmployeeData e){
        return jdbcTemplate.update(insertQuery,e.getId(),e.getName(),e.getSalary());
    }
    public int updateEmployee(EmployeeData e){
        return jdbcTemplate.update(updateQuery,e.getName(),e.getSalary(),e.getId());
    }
    public int deleteEmployee(EmployeeData e){
        return jdbcTemplate.update(deleteQuery,e.getId());
    }

}
