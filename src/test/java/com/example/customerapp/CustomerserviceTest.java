package com.example.customerapp;

import com.example.customerapp.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerserviceTest {

    CustomerService service = new CustomerService();

    @Test
    public void testAdd1Plus1()
    {
        int x  = 1 ; int y = 1;
        assertEquals(2, service.add(x,y));
    }
}
