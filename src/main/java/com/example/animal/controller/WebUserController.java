package com.example.animal.controller;

import com.example.animal.validation.WebUser;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class WebUserController {

    @RequestMapping("add")
    public String toAdd(WebUser webUser){
        return "add";
    }

    @RequestMapping("addUser")
    public String add(@Valid WebUser user, BindingResult result){
        if(result.hasErrors()){
            return "add";
        }
        System.out.println("Save user: " + user);
        return "success";
    }
}
