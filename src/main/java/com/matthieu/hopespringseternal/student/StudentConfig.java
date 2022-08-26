package com.matthieu.hopespringseternal.student;

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
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21
            );

            Student joseph = new Student(
                    "Joseph",
                    "joseph@gmail.com",
                    LocalDate.of(2004, Month.FEBRUARY, 14),
                    13
            );

            repository.saveAll(
                    List.of(mariam, joseph)
            );
        };
    }
}
