package com.TheDevCoffeePoint.RESTapiWebServicesJsonHTTPmessagingPostaman.rest;

import com.TheDevCoffeePoint.RESTapiWebServicesJsonHTTPmessagingPostaman.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        //access for Students REST service API http://localhost:7070/api/students/{studentId}
        //just index into the list ... keep it simple now
        //test for Students REST service API http://localhost:7070/api/students/1
        return theStudents.get(studentId);
    }

}
