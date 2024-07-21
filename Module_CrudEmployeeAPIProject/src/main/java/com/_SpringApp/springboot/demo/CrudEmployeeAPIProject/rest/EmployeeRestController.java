package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.rest;


import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;
import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeServices employeeServices;
    //quick and dirty : inject employee dao (use constructor injection)
    @Autowired
    public EmployeeRestController(EmployeeServices theEmployeeService) {
      employeeServices = theEmployeeService;
    }
    //expos "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeServices.findAll();
    }
}
