package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerService<T> {
    List<T> findall();
//    T porId(Long id);

    T save(T t);
//    void delete(Long id);

}
