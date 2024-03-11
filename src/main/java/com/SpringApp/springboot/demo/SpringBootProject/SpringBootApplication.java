package com.SpringApp.springboot.demo.SpringBootProject;


import com.SpringApp.springboot.demo.SpringBootProject.rest.FunRestController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

//we are adding whitch folders(packadges) should our spring boot app scan
//we are doing this so we can scann components out side of our base directory
//we also have to mention our base dir in the configuration , we moved our Coach and CricketCoach
//back to our common packadge so we don't need this for now
/*@org.springframework.boot.autoconfigure.SpringBootApplication(
		scanBasePackages = {"com.SpringApp.springboot.demo.SpringBootProject",
				            "com.SpringApp.util"}
)
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static void main(String[] args) {
		//Standard line for running our app
		SpringApplication.run(SpringBootApplication.class, args);
		//test code for RestControllers
		//FunRestController funRestController = new FunRestController();
		//System.out.println("\n"+funRestController.coachMame + funRestController.teamName);
	}

	@Bean //we define a commandline runner for command line application
	//this CommandLineRunner comes from the Spring Boot Framework
	//and this snipped of code is executed after the Spring Beans have been loaded
	public CommandLineRunner commandLineRunner(String[] args){

//		CommandLineRunner runner = new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				System.out.println("Hello World!");
//			}
//		};
		//with the -> here we skip the otherwise needed implementation  up bove
		return runner ->{
			System.out.println("Hello World! runner");
		};
	}

}
