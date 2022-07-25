package com.example.waa_playground;

import com.example.waa_playground.entity.Address;
import com.example.waa_playground.entity.Person;
import com.example.waa_playground.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class WaaPlaygroundApplication {


    public static void main(String[] args) {
        SpringApplication.run(WaaPlaygroundApplication.class, args);

    }

}
