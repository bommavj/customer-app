package com.example.customerapp.controller;

import com.example.customerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public String sendGreeting(){
        String message = customerService.getGreeting();
        return message;
    }
}
