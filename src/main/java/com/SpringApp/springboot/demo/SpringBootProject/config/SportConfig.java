package com.SpringApp.springboot.demo.SpringBootProject.config;

import com.SpringApp.springboot.demo.SpringBootProject.common.Coach;
import com.SpringApp.springboot.demo.SpringBootProject.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    //whene we call the bean id it;s the methods name starting with a small letter
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
