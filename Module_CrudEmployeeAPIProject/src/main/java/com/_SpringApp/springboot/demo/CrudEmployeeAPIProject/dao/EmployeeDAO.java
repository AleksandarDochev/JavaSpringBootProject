package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.dao;

import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    //Implementing the other functionalities of the DAO
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
