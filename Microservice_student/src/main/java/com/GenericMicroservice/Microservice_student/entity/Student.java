package com.GenericMicroservice.Microservice_student.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int schoolId;

}
