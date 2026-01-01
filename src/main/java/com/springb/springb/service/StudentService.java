package com.springb.springb.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springb.springb.model.Student;
import com.springb.springb.repo.StudentRepo;

@Service
public class StudentService {

    private StudentRepo studentRepo;
    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    public void addStudent(Student student) {
        System.out.println("student added: " + student.getRollNumber());
        studentRepo.saveStudent(student);
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
}
