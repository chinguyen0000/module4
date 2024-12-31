package com.example.customer_management.repository;

import com.example.customer_management.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        String jpql = "SELECT c FROM Customer c";
        TypedQuery<Customer> query = em.createQuery(jpql, Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(int id) {
        String jpql = "SELECT c FROM Customer c WHERE c.id=:id";
        TypedQuery<Customer> query = em.createQuery(jpql, Customer.class);
        return query.getResultList().get(0);
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        System.out.println("preparing "+customer);
        em.persist(customer);
        System.out.println("added");
    }
}
