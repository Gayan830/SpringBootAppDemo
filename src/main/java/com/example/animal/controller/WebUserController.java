package com.example.animal.controller;

import com.example.animal.validation.WebUser;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class WebUserController {

    @RequestMapping("add")
    public String toAdd(WebUser webUser){
        return "add";
    }

    @RequestMapping("addUser")
    public String add(@Valid WebUser user, BindingResult result){
        System.out.println(result.hasErrors());
        if(result.hasErrors()){
            return "add";
        }
        System.out.println("Save user: " + user);
        return "success";
    }

    @RequestMapping("/arith")
    public String add(){
        int num = 10 / 0;
        return "addition";
    }

//    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
//    public ModelAndView handlerArithmeticException(Exception e){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", e.toString());
//        modelAndView.setViewName("mathError");
//        return modelAndView;
//    }

    @RequestMapping("/update")
    public String update(){
        String name = null;
        name = name.toLowerCase();
        return "update";
    }

//    @ExceptionHandler(value = {java.lang.NullPointerException.class})
//    public ModelAndView handleNullPointerException(Exception e){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", e.toString());
//        modelAndView.setViewName("nullPointerError");
//        return modelAndView;
//    }

}
