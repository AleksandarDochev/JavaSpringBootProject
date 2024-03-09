package com.SpringApp.springboot.demo.SpringBootProject.rest;

import com.SpringApp.springboot.demo.SpringBootProject.common.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCoreController {

    //Create a constructor in our class for injections
    //define private field for the dependency
    private Coach myCoach;
    //Define constructor for dependency injection
    @Autowired
    public SpringCoreController(Coach theCoach){
        myCoach=theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
