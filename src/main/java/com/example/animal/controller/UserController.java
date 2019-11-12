package com.example.animal.controller;

import com.example.animal.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("demo")
    public String demo(Model model){
        model.addAttribute("message","Welcome to Thymeleaf.");
        double grade = 40.5;
        model.addAttribute("grade",grade);
        System.out.println(convertGPA(grade));
        model.addAttribute("GPA",convertGPA(grade));
        return "demo";
    }

    @RequestMapping("demo2")
    public String demo2(Model model){
        List<User>  users = new ArrayList<>();
        users.add(new User(1,"Garry",23));
        users.add(new User(1,"James",30));
        users.add(new User(1,"Terrance",40));
        model.addAttribute("users",users);
        return "demo2";
    }

    @RequestMapping("demo3")
    public String demo3(HttpServletRequest request,Model model){
        //request
        request.setAttribute("request","Request Data");
        //session
        request.getSession().setAttribute("session","Session Data");
        //application
        request.getSession().getServletContext().setAttribute("application","Application Data");
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
