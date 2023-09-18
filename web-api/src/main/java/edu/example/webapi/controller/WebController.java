package edu.example.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping
    public String welcome() {
        return "Welcome to my Springboot Web API";
    }
}
