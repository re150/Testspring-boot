package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepositori;
import com.example.demo.service.CustomerService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @PostMapping("/add")
    public String add(@RequestBody Customer customer) {
        customerService.save(customer);
        logger.info("New Customer added: {}", customer);
        return "New Customer is added";
    }
    @GetMapping("/getAll")
    public List<Customer> findall() {
       return customerService.findall();
    }
}
