package com.example.demo.service;


import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServicesImpl implements CustomerService<Customer> {
    @Autowired
    private CustomerRepositori customerRepositori;

    @Override
    public List<Customer> findall() {
        List<Customer> customers = customerRepositori.findAll();
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
        return customerRepositori.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepositori.save(customer);
    }

}
