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
    @RequestMapping("/home")
    public String home(){
        System.out.println("home is working");
        return "home";
    }
}
