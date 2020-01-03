package main.java.com.locspring.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("title", "Hello Thymeleaf");
        return "home";
    }
}
