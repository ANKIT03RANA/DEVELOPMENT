package com.devspring.springJDBCex;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.devspring.springJDBCex.model.Student;
import com.devspring.springJDBCex.service.Studentservice;

@SpringBootApplication
public class SpringJdbCexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbCexApplication.class, args);
		Student stu = context.getBean(Student.class);
		stu.setRollNo(4);
		stu.setName("Ankit");
		stu.setMarks(4);

		Studentservice service = context.getBean(Studentservice.class);
		service.addStudent(stu);

		List<Student> students = service.getAllStudents();
		System.out.println(students);
	}

}
