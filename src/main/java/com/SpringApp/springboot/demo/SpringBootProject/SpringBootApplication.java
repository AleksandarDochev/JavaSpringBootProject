package com.SpringApp.springboot.demo.SpringBootProject;


import com.SpringApp.springboot.demo.SpringBootProject.rest.FunRestController;
import org.springframework.boot.SpringApplication;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootApplication.class, args);

		//FunRestController funRestController = new FunRestController();
		//System.out.println("\n"+funRestController.coachMame + funRestController.teamName);


	}


}
