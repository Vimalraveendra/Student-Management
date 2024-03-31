package com.example.studentmanagementsystem.config;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
      return args -> {
          Student Melvin =new Student(
                  1L,
                  "Melvin",
                  "Boss",
                  "jose@gmail.com"
          );
          Student Karina= new Student(
                  2L,
                  "karina",
                  "James",
                  "maria@gmail.com"
          );
          Student James=  new Student(
                  3L,
                  "James",
                  "Cameroon",
                  "james@gmail.com"
          );
          Student Bella= new Student(
                  4L,
                  "Bella",
                  "James",
                  "bell@gmail.com"
          );
          repository.saveAll(
                  List.of(Melvin,Karina,James,Bella)
          );
      };
    }
}
