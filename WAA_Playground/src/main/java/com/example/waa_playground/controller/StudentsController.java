package com.example.waa_playground.controller;

import com.example.waa_playground.entity.Student;
import com.example.waa_playground.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    StudentRepo studentRepo;

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentRepo.save(student);
    }

}
