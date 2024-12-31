package com.example.customer_management.repository;

import com.example.customer_management.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerRepository implements ICustomerRepository{
    private static List<Customer> customers;
    static {
        customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Nguyễn Khắc Nhật", "nhat@codegym.vn", "Hà Nội"));
        customers.add(new Customer(2, "Dang Huy Hoa", "hoa.dang@codegym.vn", "Đà Nẵng"));
        customers.add(new Customer(3, "Lê Thị Châu", "chau.le@codegym.vn", "Hà Nội"));
        customers.add(new Customer(4, "Nguyễn Thùy Dương", "duong.nguyen@codegym.vn", "Sài Gòn"));
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }
}
