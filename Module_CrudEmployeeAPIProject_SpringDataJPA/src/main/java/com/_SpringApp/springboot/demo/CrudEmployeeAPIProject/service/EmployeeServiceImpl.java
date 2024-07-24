package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.service;

import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.dao.EmployeeRepository;
import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeServices{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);
        Employee theEmployeeReference = null;
        if (result.isPresent()) {
            theEmployeeReference = result.get();
        } else {
            throw new RuntimeException("Did not find employee id-" + theId);
        }
        return theEmployeeReference;
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
