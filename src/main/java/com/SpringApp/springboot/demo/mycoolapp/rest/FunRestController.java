package com.SpringApp.springboot.demo.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello world!";
    }
    //exposing new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day.";
    }
    //Example of injection
    @Value("${coach.name}")
    public String coachMame;
    //Example of injection
    @Value("${team.name}")
    public String teamName;

}
