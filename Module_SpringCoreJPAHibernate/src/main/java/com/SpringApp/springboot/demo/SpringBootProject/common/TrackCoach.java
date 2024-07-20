package com.SpringApp.springboot.demo.SpringBootProject.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("In constructor: " +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5 K";
    }
}
