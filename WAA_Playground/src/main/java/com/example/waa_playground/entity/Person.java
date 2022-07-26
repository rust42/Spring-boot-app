package com.example.waa_playground.entity;

import com.example.waa_playground.repository.PersonRepo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
//@DiscriminatorColumn(name = "person_type")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorValue(value = "Person")

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String phone;

    @JsonIgnoreProperties
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    @Fetch(FetchMode.SUBSELECT)
    List<Address> addresses;

    void addAddress(Address address) {
        this.addresses.add(address);
    }
}
