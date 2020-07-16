package com.kb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/pages")
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {

        model.addAttribute("message", "Hi user, Great !! , welcome to First Spring MVC project");

        return "helloWorld";
    }

}