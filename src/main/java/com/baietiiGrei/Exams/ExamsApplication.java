package com.baietiiGrei.Exams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ExamsApplication {

	public static void main(String[] args) {
		Student s;
		SpringApplication.run(ExamsApplication.class, args);
	}

}

