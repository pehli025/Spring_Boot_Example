package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student josh = new Student (
                    "Josh",
                    "Joshpehling@gmail.com",
                    LocalDate.of(1996, AUGUST, 18)
            );
            Student alex = new Student (
                    "Josh",
                    "Joshpehling@gmail.com",
                    LocalDate.of(2004, AUGUST, 18)
            );

            repository.saveAll(
                    List.of(josh, alex)
            );
        };
    }
}
