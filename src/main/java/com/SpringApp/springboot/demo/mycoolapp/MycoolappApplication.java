package com.SpringApp.springboot.demo.mycoolapp;


import com.SpringApp.springboot.demo.mycoolapp.rest.FunRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {

		SpringApplication.run(MycoolappApplication.class, args);

		FunRestController funRestController = new FunRestController();
		System.out.println(funRestController.coachMame + funRestController.teamName);


	}


}
