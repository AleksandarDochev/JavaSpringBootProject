package com.GenericMicroservice.Microservice_student.entity;


import jakarta.persistence.*;

//Create this entity and simply map it to our DB table
@Entity
@Table(name = "student") //it's the name of the table under the schema name
public class Student_TraditionalLessSpring {
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
    @Column(name = "schoolId")
    private int schoolId;
    //define constructor + no arguments constructor(The no argument constructor is
    // created because JPA is requiring it )
    public Student_TraditionalLessSpring() {
    }

    //define constructor with all fields except the ID because its auto generated
//    with the @Id and  @GeneratedValue annotations
    public Student_TraditionalLessSpring(String firstName, String lastName, int schoolId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolId = schoolId;
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

    public int getSchoolId() {return schoolId;}

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    //define toString method

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SchoolId='" + schoolId + '\'' +
                '}';
    }
}
