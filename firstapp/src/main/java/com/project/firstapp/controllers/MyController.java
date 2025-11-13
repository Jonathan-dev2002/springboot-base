package com.project.firstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String display(){
        return "Hello World";
    }

    @GetMapping("/about")
    public String about(){
        return "about yourself";
    }

}
