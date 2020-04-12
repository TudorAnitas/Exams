package com.baietiiGrei.Exams;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Controller
public class AppController {

    @RequestMapping("/test")
    public String welcome(){
        return "index2.jsp";
    }
    @RequestMapping("/exams")
    public String exams(Model model){
        Scheduler scheduler = new Scheduler();
        List<Exam> examList = scheduler.getExamList();

        model.addAttribute("exams",examList);
        return "exams";
    }
    @RequestMapping("/home")
    public String home(){
        System.out.println("home is working");
        return "home";
    }
}
