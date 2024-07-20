package com.TheDevCoffeePoint.RESTapiWebServicesJsonHTTPmessagingPostaman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RESTapiWebServicesJSON_App {

	public static void main(String[] args) {
		SpringApplication.run(RESTapiWebServicesJSON_App.class, args);
		//access endpoint test http://localhost:7070/test/hello
		//access for Students REST service API http://localhost:7070/api/students
	}

}
