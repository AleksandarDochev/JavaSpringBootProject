package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.service;

import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;

import java.util.List;

public interface EmployeeServices {

    List<Employee> findAll();
}

