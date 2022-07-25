package com.example.waa_playground.repository;

import com.example.waa_playground.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {
}
