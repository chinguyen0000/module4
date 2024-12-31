package com.example.customer_management.repository;

import com.example.customer_management.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    Customer findById(int id);
}
