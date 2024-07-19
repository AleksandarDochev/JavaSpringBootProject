package com.SpringApp.springboot.demo.SpringBootProject.entity;

import jakarta.persistence.*;

//we map this class to a DB table
@Entity
@Table(name = "Student")
public class Student {
    //we map fields to the database columns

    //define fields
    @Id  //we use this annotation to make this int a Primary key
    //we say to SQL should handle new key generation incrementally for this ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id") //map to actual Database column
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    //define constructors
    //we define a no argument constructor
    public Student() {

    }

    //we define a 3 argument constructor
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    //define getters/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //define toString() method

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
