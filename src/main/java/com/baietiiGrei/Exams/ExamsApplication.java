package com.baietiiGrei.Exams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class ExamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamsApplication.class, args);
	}

	// controller used to check the url for a certain word
	// show the home html page
	@Controller
	public class GreetingController {
		// if the url ends in /home it shows the home.html
		@GetMapping("/home")
		public String greeting( Model model) {
			model.addAttribute("name");
			return "home";
		}

	}
}

