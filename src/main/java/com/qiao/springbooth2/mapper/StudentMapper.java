package com.qiao.springbooth2.mapper;

import com.qiao.springbooth2.po.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        String name = rs.getString("name");
        String passportNumber = rs.getString("passport_number");
        Student student = new Student();
        student.setName(name);
        student.setPassportNumber(passportNumber);
        return student;
    }
}
