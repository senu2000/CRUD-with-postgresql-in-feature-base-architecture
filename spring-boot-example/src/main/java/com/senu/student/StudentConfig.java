package com.senu.student;

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
            Student senu = new Student(
                    "senu",
                    "senu@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 19)
            );
            Student suvi = new Student(
                    "suvi",
                    "suvi@gmail.com",
                    LocalDate.of(2001, Month.JUNE, 14)
            );
            repository.saveAll(
                    List.of(senu,suvi)
            );

        };
    }
}
