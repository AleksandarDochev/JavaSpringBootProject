package com.TheDevCoffeePoint.RESTapiWebServicesJsonHTTPmessagingPostaman.entity;

public class Student {

    private String firstName;
    private String lastName;

    //no argument constructor
    public Student() {
    }
    //constructor for fields
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
