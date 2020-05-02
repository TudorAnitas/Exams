package com.baietiiGrei.Exams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;
import java.util.stream.Collectors;

@RestController
public class AppController {

    private final ExamRepository repository;

    AppController(@Autowired ExamRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/exams")
    public List<Exam> all(@RequestParam(required = false, name = "study_year") Integer studyYear, @RequestParam(required = false, name = "section") String section,
        @RequestParam(required = false, name = "teacher") String teacher, @RequestParam(required = false, name = "classroom") String classroom) {

        List<Exam> exams = repository.findAll();
        if(studyYear != null)
            exams = exams.stream().filter(e -> e.getStudy_year() == studyYear).collect(Collectors.toList());
        if(section != null)
            exams = exams.stream().filter(e -> e.getSection().equals(section)).collect(Collectors.toList());
        if(teacher != null)
            exams = exams.stream().filter(e -> e.getTeacher().equals(teacher)).collect(Collectors.toList());
        if(classroom != null)
            exams = exams.stream().filter(e -> e.getClassroom().equals(classroom)).collect(Collectors.toList());

        return exams;
    }

    @PostMapping("/exams")
    public ResponseEntity<Exam> newStudent(@RequestBody Exam exam) {
        return ResponseEntity.ok(repository.save(exam));
    }

    @PutMapping("/exams") // ?
    public ResponseEntity<String> updateExam(@RequestBody Exam exam) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/exams")
    public ResponseEntity<String> deleteExam(@RequestParam(name = "id") Long id) {
        repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}