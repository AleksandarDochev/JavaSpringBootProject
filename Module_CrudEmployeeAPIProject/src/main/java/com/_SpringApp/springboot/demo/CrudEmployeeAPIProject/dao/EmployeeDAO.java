package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.dao;

import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
