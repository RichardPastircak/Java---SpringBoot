package com.example.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student testGuy = new Student(
                    "TestGuy",
                    "testguy@gmail.com",
                    LocalDate.of(2000, Month.APRIL,2)

            );

            Student testGirl = new Student(
                    "TestGirl",
                    "testgirl@gmail.com",
                    LocalDate.of(1995, Month.MAY,5)

            );

            repository.saveAll(List.of(testGuy,testGirl));
        };
    }
}
