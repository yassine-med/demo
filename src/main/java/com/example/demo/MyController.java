package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello dear!";
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return List.of(
                new Student("AJIL", LocalDate.of(1986, 3, 25), "Casablanca", "CNE778946123"),
                new Student("CHAMA", LocalDate.of(1996, 9, 15), "Fez", "GFD987412315")
                );
    }
}
