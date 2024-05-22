package com.SpringApp.springboot.demo.SpringBootProject.dao;

import com.SpringApp.springboot.demo.SpringBootProject.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Student findByID(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        //create query                                             //name of JPA entity
                                                                         //not name of the database table
                                                                       //all JPQL syntax based on entity name and fields
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student",Student.class);
        //return query results
        return theQuery.getResultList();
    }
    @Override
    public List<Student> queryByLastName() {
        //create query                                             //name of JPA entity
        //not name of the database table
        //all JPQL syntax based on entity name and fields
        //order by ascending add in order by "desc" or"asc"
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName asc",Student.class);
        //return query results
        return theQuery.getResultList();
    }


}
