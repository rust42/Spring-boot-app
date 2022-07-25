package com.example.waa_playground;

import com.example.waa_playground.entity.Address;
import com.example.waa_playground.entity.Person;
import com.example.waa_playground.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Playground {
    @Autowired
    PersonRepo personRepo;

    public void play() {
        Address address = new Address();
        address.setState("Iowa");
        address.setStreet("1000 N 4th Street");

        Person person = new Person();
        person.setFirstName("Sandeep");
        person.setLastName("Koirala");
        person.setPhone("0505938096");
//        person.;
        personRepo.save(person);

    }

}
