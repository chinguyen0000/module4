package com.example.customer_management.controller;

import com.example.customer_management.model.Customer;
import com.example.customer_management.repository.CustomerRepository;
import com.example.customer_management.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class CustomerController {
    @Autowired
    ICustomerRepository ic = new CustomerRepository();
    @GetMapping("/")
    public String showList(Model model) {

        List<Customer> customers = ic.findAll();
        model.addAttribute("customers", customers);
        return "list";
    }
    @GetMapping("/customers")
    public String showCustomer(Model model, @RequestParam int id) {
        Customer customer = ic.findById(id);
        System.out.println(customer);
        model.addAttribute("customer", customer);
        return "info";
    }
}
