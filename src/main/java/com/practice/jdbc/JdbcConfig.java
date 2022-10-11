package com.practice.jdbc;

import com.practice.jdbc.StudentDao;
import com.practice.jdbc.StudentDaoImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class JdbcConfig{
    @Bean(name = { "ds" })
    public DriverManagerDataSource getData(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:tcp://localhost/~/test");
        ds.setUsername("sa");
        ds.setPassword("");
        return ds;
    }
    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getData());
        return jdbcTemplate;
    }
     @Bean(name = { "studentDao" })
    public StudentDao getStudentDao(){
         StudentDaoImplement studentDao = new StudentDaoImplement();
         studentDao.setJdbcTemplate(getTemplate());
         return studentDao;
     }
}
