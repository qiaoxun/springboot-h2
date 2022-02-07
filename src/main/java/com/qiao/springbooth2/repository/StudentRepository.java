package com.qiao.springbooth2.repository;

import com.qiao.springbooth2.mapper.StudentMapper;
import com.qiao.springbooth2.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Student getById(Long id) {
        Student student = jdbcTemplate.queryForObject("select * from student where id=?", new Object[]{ id }, new StudentMapper());
        return student;
    }

}
