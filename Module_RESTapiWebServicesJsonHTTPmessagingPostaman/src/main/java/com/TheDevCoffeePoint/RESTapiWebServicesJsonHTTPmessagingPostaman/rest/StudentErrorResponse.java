package com.TheDevCoffeePoint.RESTapiWebServicesJsonHTTPmessagingPostaman.rest;

public class StudentErrorResponse {
    //defining fies
    public int status;
    public String message;
    public long timeStamp;

    //no argument constructor
    public StudentErrorResponse() {
    }

    //constructor
    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
    //getters and setters for StudentErrorResponse

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
