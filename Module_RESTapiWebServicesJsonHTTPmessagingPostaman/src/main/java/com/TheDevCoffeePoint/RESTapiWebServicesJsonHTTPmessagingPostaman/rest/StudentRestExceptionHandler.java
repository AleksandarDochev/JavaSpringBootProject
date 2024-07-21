package com.TheDevCoffeePoint.RESTapiWebServicesJsonHTTPmessagingPostaman.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    //add exception handling code here from StudentRestController.java in our project
    //add an exception handler using @ExceptionHandler

    //exception handler method
    @ExceptionHandler
    //we choose a response body type\/           //exception type to handle/catch  \/
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
        //create a StudentErrorResponse
        //we use the previously created StudentErrorResponse to give a value to HttpStatus responder
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        //testing for case http://localhost:7070/api/students/564654
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        //return Response entity
        //body\/      //Status code \/
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
    //add another exception handler to catch any exception that has been thrown
    @ExceptionHandler
    //same as the first one only diff is                         \/ this is a generic exception handler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
        //create a StudentErrorResponse
        //we use the previously created StudentErrorResponse to give a value to HttpStatus responder
        StudentErrorResponse error = new StudentErrorResponse();
        //But here we are going to give the case for a bad request a 400 error response
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        //testing for case http://localhost:7070/api/students/asdasda
        //or we can use this to have a nicer repose to the user
        //error.setMessage("USE the correct data smart Pants");
        error.setTimeStamp(System.currentTimeMillis());
        //return Response entity
        //body\/      //Status code \/       //editing here for 400 error
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
}
