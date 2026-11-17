package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student rejan = new Student(
                   "rejan",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "rejan.miloti@gmail.com"
            );

            Student roan = new Student(

                    "roan",
                    LocalDate.of(2002, Month.FEBRUARY, 7),
                    "roan@gmail.com"
            );

            repository.saveAll(
                    List.of(rejan, roan)
            );
        };
    }
}
