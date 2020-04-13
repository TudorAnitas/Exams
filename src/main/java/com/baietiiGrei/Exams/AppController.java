package com.baietiiGrei.Exams;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
public class AppController {

    private final StudentRepository repository;

    AppController(StudentRepository repository) {
        this.repository = repository;
    }

    // Aggregate root

    @GetMapping("/employees")
    List<Student> all() {
        return (List<Student>) repository.findAll();
    }

    @PostMapping("/employees")
    Student newEmployee(@RequestBody Student newEmployee) {
        return repository.save(newEmployee);
    }

    @RequestMapping("/test")
    public String welcome(){
        return "index2.jsp";
    }
    @RequestMapping("/home")
    public String home(){
        System.out.println("home is working");
        return "home";
    }
}
