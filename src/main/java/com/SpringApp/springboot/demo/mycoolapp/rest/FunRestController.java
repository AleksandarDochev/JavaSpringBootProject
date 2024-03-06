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
    //Example of injection
    @Value("${coach.name}")
    public String coachMame;
    //Example of injection
    @Value("${team.name}")
    public String teamName;

}
