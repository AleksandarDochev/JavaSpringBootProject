package com.GenericMicroservice.Microservice_student.entity;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer studentId;
}
