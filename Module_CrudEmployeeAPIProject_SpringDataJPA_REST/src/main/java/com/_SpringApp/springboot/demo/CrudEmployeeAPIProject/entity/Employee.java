package com._SpringApp.springboot.demo.CrudEmployeeAPIProject.entity;


import jakarta.persistence.*;

//Create this entity and simply map it to our DB table
@Entity
@Table(name = "employee") //it's the name of the table under the schema name
public class Employee {
    //define fields and we add Spring annotations
    @Id  //we use this annotation to make this int a Primary key
    //we say to SQL should handle new key generation incrementally for this ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") //map to actual Database column
    private int id;
    @Column(name = "first_Name") //we use the absolute names of the columns in the SQL DB table in workbench
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "email")
    private String email;
    //define constructor + no arguments constructor(The no argument constructor is
    // created because JPA is requiring it )
    public Employee() {
    }

    //define constructor with all fields except the ID because its auto generated
//    with the @Id and  @GeneratedValue annotations
    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    //define getters and setters for all fields

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

    //define toString method

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
