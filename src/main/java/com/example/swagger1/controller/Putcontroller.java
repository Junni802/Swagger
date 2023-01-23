package com.example.swagger1.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class Putcontroller {

    @PutMapping(value = "/default")
    public String putMethod() {
        return "Hello Wolrd";
    }

    @PutMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map ->
                sb.append(map.getKey() + ":" + map.getValue() + "\n"));

        return sb.toString();
    }

}
