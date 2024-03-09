package com.SpringApp.springboot.demo.SpringBootProject.rest;

import com.SpringApp.springboot.demo.SpringBootProject.common.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCoreController {

    //Create a constructor in our class for injections
    //define private field for the dependency
    private Coach myCoach;
    //private Coach anotherCoach;
    //Define constructor for dependency injection
    //and the @Qualifier is given starting with a small letter ,
    //@Qualifier is not needed if a have a bean with a @Primary .
    //but @Qualifier is going to overwrite the @Primary
    @Autowired
    public SpringCoreController(
            @Qualifier("cricketCoach") Coach theCoach)
            //@Qualifier("cricketCoach") Coach theAnotherCoach)
    {
        System.out.println("In constructor: " +getClass().getSimpleName());
        //anotherCoach=theAnotherCoach;
        myCoach=theCoach;
    }
    //Define setter for dependency injection
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach=theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
//    @GetMapping("/check")
//    public String check(){
//        return "Comparing beans: myCoach == anotherCoach, "+ (myCoach==anotherCoach);
//    }
}
