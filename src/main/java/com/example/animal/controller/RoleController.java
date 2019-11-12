package com.example.animal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoleController {

    @RequestMapping("/roleadd")
    public String add(){
        int sum = 10/0;
        return "add";
    }

}
