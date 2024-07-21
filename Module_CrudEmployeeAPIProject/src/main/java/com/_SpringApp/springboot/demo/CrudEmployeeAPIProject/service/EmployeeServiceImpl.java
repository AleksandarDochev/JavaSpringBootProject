package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.service;

import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.dao.EmployeeDAO;
import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServices{
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
