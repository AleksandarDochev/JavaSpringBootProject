package com.SpringApp.springboot.demo.SpringBootProject.dao;


import com.SpringApp.springboot.demo.SpringBootProject.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save (Student theStudent);
    Student findByID(Integer id);

    List<Student> findAll();

    List<Student> queryByLastName();
    List<Student> findOnlyByLastName(String theLastName);
    void updateStudentMethod (Student theStudent);
}
