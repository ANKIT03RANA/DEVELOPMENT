package com.devspring.springJDBCex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devspring.springJDBCex.model.Student;
import com.devspring.springJDBCex.repository.StudentRepo;

@Service
public class Studentservice {

    private StudentRepo repo;
    
    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student stu) {
        System.out.println("Student added");
        repo.save(stu);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }
    
}
