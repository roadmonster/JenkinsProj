package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private String name;
    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }

    @PostMapping("/{name}")
    public void createName(@PathVariable String name){
        this.name = name;
    }

    @GetMapping("/greeting")
    public String greeting(){
        return "Hello" + this.name;
    }
}
