package com.baietiiGrei.Exams;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final StudentRepository repository;

    @Autowired
    public DatabaseLoader(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Student((long) 1, "Paul", "paul@e-uvt.ro", 2, "Section"));
    }
}
