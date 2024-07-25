package com._SpringApp.springboot.demo.CrudEmployeeAPIProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudEmployeeSpringSecurity {

	public static void main(String[] args) {
		SpringApplication.run(CrudEmployeeSpringSecurity.class, args);

		//Example endpoints
		//test http://localhost:6050/magic-api/employees
		//test by ID http://localhost:6050/magic-api/employees/2
	}

}
