package com.jenkins.jenkins.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class JenkinsController {


    @GetMapping("/all")
    public ResponseEntity<String> getDetails(){
        return ResponseEntity.ok("welcome to jenkins world");
    }


}
