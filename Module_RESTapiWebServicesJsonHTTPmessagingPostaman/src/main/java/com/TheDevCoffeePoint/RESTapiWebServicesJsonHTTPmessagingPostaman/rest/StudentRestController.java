package com.TheDevCoffeePoint.RESTapiWebServicesJsonHTTPmessagingPostaman.rest;

import com.TheDevCoffeePoint.RESTapiWebServicesJsonHTTPmessagingPostaman.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    //define a field , load the fields so data entry is done separately each and every time
    private List<Student> theStudents;
    //define @PostConstruct to load the student data ... only once
    @PostConstruct
    public void loadData (){

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
    }
    //define endpoint for "/students" - return list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        //access for Students REST service API http://localhost:7070/api/students

        return theStudents;
    }
    //define endpoint for "/students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}")//this is a path variable

    public Student getStudent(@PathVariable int studentId){
        //Error handling , check student array size against the given value
        if (studentId >= theStudents.size() || studentId<0){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        //access for Students REST service API http://localhost:7070/api/students/{studentId}
        //just index into the list ... keep it simple now
        //test for Students REST service API http://localhost:7070/api/students/1
        return theStudents.get(studentId);
    }

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






