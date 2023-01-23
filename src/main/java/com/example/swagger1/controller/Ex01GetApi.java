package com.example.swagger1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex01GetApi {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }
}
