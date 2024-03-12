package com.SpringApp.springboot.demo.SpringBootProject.dao;

import com.SpringApp.springboot.demo.SpringBootProject.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//Specialized annotation for repositories
//supports component scanning
//Translates JDBC exceptions
@Repository
public class StudentDAOImpl implements StudentDAO{

    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        System.out.println("In constructor: " +getClass().getSimpleName());
        this.entityManager = entityManager;
    }

    //once we write public class StudentDAOImpl implements StudentDAO
    //it gives us an option to implement the methods
    //implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        //saves the student to DB
        entityManager.persist(theStudent);

    }
}
