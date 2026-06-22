package com.example.meven.demo17.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CamItController {
    
    @GetMapping("/hello")
    public String getMethodName() {
        return "hello worlds !";
    }
    

}
