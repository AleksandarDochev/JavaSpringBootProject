package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.rest;


import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.dao.EmployeeDAO;
import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDAO employeeDAO;
    //quick and dirty : inject employee dao
    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        this.employeeDAO = theEmployeeDAO;
    }
    //expos "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }
}
