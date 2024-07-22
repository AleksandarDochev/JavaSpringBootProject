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

    //No @transaction needed here because this is handled by the Service
    @Override
    public Employee findById(int theId) {
        //get Employee
        Employee theEmployee = entityManager.find(Employee.class,theId);
        //return the employee
        return theEmployee;
    }
    //No @transaction needed here because this is handled by the Service
    @Override
    public Employee save(Employee theEmployee) {
        //save the employee
        //this merge method will perorm a save or an update depending on
        //if the id is 0 then it's a new employee
        //if the id is not 0 then it's an existing employee
        Employee dbEmployee = entityManager.merge(theEmployee);
        //return the DB employee
        //It's really we return this values so we know the actual UPDATED value from the DB it self
        return dbEmployee;
    }
    //No @transaction needed here because this is handled by the Service

    @Override
    public void deleteById(int theId) {
        //find the employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);
        //delete the employee
        entityManager.remove(theEmployee);
    }
}
