package com.example.customer_management.controller;

import com.example.customer_management.model.Customer;
import com.example.customer_management.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String index(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "home";
    }

    @GetMapping("/create-form")
    public String displayAddForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "add_customer";
    }

    @PostMapping("/add-customer")
    public String addCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
        System.out.println(customer);
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Add customer successfully");
        return "redirect:/customer";
    }
}
