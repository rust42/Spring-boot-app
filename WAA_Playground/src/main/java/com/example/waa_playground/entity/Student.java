package com.example.waa_playground.entity;


import lombok.Data;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
//@DiscriminatorValue(value = "Student")
public class Student extends Person {
    private String level;
    private float loans;
}
