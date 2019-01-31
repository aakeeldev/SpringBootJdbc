package com.abdul.repository;

import com.abdul.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentJdbcRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Student findById(Long id){
        return jdbcTemplate.queryForObject("select * from student where id=?", new Object[] {id},
                new BeanPropertyRowMapper< Student >(Student.class));
    }
}
