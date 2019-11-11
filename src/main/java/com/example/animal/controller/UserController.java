package com.example.animal.controller;

import com.example.animal.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("demo")
    public String demo(Model model){
        model.addAttribute("message","Welcome to Thymeleaf.");
        double grade = 90.5;
        model.addAttribute("grade",grade);
        System.out.println(convertGPA(grade));
        model.addAttribute("GPA",convertGPA(grade));
        return "demo";
    }

    @RequestMapping("demo2")
    public String demo2(Model model){
        List<User>  users = new ArrayList<>();
        return "demo2";
    }

    private String convertGPA(double grade){
        if(grade >= 90){
            return "A";
        }else if (grade >=80){
            return "B";
        }else if (grade >=70){
            return "C";
        }else if (grade >=60){
            return "D";
        }else {
            return "F";
        }
    }
}
