package com.springb.springb.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.springb.springb.model.Student;

@Repository
public class StudentRepo {
    
    private JdbcTemplate jdbc;
    
    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void saveStudent(Student student) {
        String sql = "INSERT INTO student (roll_no, name, age) VALUES (?, ?, ?)";
        int rows = jdbc.update(sql, student.getRollNumber(), student.getName(), student.getAge());
        System.out.println("Rows inserted: " + rows);
    }
    
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
