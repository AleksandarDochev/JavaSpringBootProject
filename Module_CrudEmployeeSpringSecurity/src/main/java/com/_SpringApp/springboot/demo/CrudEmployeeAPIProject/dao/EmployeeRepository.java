package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.dao;

import com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//we add this, so we can use a different endpoint name or "hide" the employee name w have in the entity object
//commenting out for the sake of the new module
//@RepositoryRestResource(path = "members")  //http://localhost:6065/magic-api/employees ->http://localhost:6065/magic-api/members
//we extend the JpaRepository               //and we select the entity type\/ //Primary key tyoe
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}
