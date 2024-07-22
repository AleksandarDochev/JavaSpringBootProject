package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.rest;


import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;
import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //add mapping for GET /employees/{employeeId}
    @GetMapping("/employees/{employeeId}")
    //By default, the same as the one shown above {employeeId}
    //so we get use this {employeeId}
    public Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee = employeeServices.findById(employeeId);
        if(theEmployee ==null){
            throw new RuntimeException("Employee not found - id: " + employeeId);
        }
        return theEmployee;
    };
    //add mapping for POST /employees - add new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        //also just in case they pass id in JSON .. set id to 0
        //this is to force a save of new item instead of update
        theEmployee.setId(0);
        Employee dbEmployee = employeeServices.save(theEmployee);
        return dbEmployee;
    }
    //testing done POST http://localhost:6060/api/employees
    //{
    //   "firstName": "John",
    //   "lastName": "doe",
    //   "email": "hector@luv2code"
    //}
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeServices.save(theEmployee);
        return dbEmployee;
    }
    //testing done PUT http://localhost:6060/api/employee
}
