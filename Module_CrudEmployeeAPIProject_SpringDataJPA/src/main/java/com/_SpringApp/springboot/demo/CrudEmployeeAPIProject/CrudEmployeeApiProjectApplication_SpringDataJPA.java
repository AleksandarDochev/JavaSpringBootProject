package com._SpringApp.springboot.demo.CrudEmployeeAPIProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudEmployeeApiProjectApplication_SpringDataJPA {

	public static void main(String[] args) {
		SpringApplication.run(CrudEmployeeApiProjectApplication_SpringDataJPA.class, args);
		//test http://localhost:6060/api/employees
		//test by ID http://localhost:6060/api/employees/2

		//test POST  in JSON format -> JSON_howToTestEndpointsGuide
		//Endpoint test to POST in JSON format
		//POST http://localhost:6060/api/employees
		//the requested body is provided in place
		//Content-Type: application/json
		//
		////
		//{
        //  "name": "John Doe",
        //  "position": "Software Engineer",
        //  "department": "IT",
        //  "salary": 80000
        //}
	}

}
