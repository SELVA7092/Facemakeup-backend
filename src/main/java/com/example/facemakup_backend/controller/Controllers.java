package com.example.facemakup_backend.controller;

import com.example.facemakup_backend.models.Users;
import com.example.facemakup_backend.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping
@CrossOrigin
public class Controllers {

    @Autowired
    Services ser;

        @GetMapping("/test")
    public String Test(){
        return "hello";
    }
    @RequestMapping("/register")
    public String Test(@RequestBody Users user){
        return ser.register(user);
    }
}
