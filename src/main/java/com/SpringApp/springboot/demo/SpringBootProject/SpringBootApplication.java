package com.SpringApp.springboot.demo.SpringBootProject;


import org.springframework.boot.SpringApplication;

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

		SpringApplication.run(SpringBootApplication.class, args);

		//FunRestController funRestController = new FunRestController();
		//System.out.println("\n"+funRestController.coachMame + funRestController.teamName);


	}


}
