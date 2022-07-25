package com.example.waa_playground.repository;

import com.example.waa_playground.Cachable;
import com.example.waa_playground.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer> {
}
