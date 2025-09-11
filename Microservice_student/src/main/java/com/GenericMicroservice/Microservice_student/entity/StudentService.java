package com.GenericMicroservice.Microservice_student.entity;

import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public void saveStudent(Student student){
        repository.save(student);
    }
    public List<Student> findAllStudents(){
        return repository.findAll();
    }
}
