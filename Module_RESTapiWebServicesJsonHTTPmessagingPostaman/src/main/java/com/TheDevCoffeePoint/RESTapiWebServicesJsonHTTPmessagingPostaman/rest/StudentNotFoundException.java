package com.TheDevCoffeePoint.RESTapiWebServicesJsonHTTPmessagingPostaman.rest;

public class StudentNotFoundException extends RuntimeException {
    //generate constructors from super class
    //from generate choose super class constructor , select the middle 3
    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
