package com.springb.springb;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.springb.springb.model.Student;
import com.springb.springb.service.StudentService;

@SpringBootApplication
public class SpringbApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNumber(4);
		s.setName("Smtg");
		s.setAge(20);

		StudentService ss = context.getBean(StudentService.class);
		ss.addStudent(s);

		List<Student> students = ss.getStudents();
		System.out.println(students);
	}

}
