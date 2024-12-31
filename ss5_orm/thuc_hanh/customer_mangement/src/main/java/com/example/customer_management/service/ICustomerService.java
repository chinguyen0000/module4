package com.example.customer_management.service;

import com.example.customer_management.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findByID(int id);
    void save(Customer customer);
}
