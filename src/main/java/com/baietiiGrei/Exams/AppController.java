package com.baietiiGrei.Exams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
public class AppController {

    private final ExamRepository repository;

    AppController(@Autowired ExamRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/exams")
    public List<Exam> all(@RequestParam(name = "id") Long id) {
        return (List<Exam>) repository.findAll();
    }

    @PostMapping("/exams")
    public ResponseEntity<Exam> newStudent(@RequestBody Exam exam) {
        return ResponseEntity.ok(repository.save(exam));
    }

    @PutMapping("/exams")
    public ResponseEntity<String> updateExam(@RequestBody Exam exam) {
        //repository.
        return new ResponseEntity<>(HttpStatus.OK);
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