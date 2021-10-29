package com.example.customerapp.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public String getGreeting() {
        return "Hello from customer app";
    }

    public Object add(int x, int y) {
        return x + y;
    }
}
