package com.example.Resume.Builder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String Home(){
        return "Hello";
    }
    @GetMapping("/edit")
    public String Edit(){
        return "Edit Page";
    }
}
