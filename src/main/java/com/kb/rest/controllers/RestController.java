package com.kb.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kb.rest.model.User;

@Controller
@RequestMapping("/rest")
public class RestController {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public @ResponseBody User getUserForId(@PathVariable ("id") int id) {
        User user = new User();
        user.setId(id);
        user.setName("John");
        user.setAge(45);
        return user;
    }
}