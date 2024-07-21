package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.dao;

import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    //define fields for entity manager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }
    @Override
    public List<Employee> findAll() {
        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee",Employee.class);
        //execute query and get result list
        List<Employee> employees = theQuery.getResultList();
        //return the results
        return employees;
    }
}
