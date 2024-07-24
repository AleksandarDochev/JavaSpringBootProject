package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.dao;

import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//we extend the JpaRepository               //and we select the entity type\/ //Primary key tyoe
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}
