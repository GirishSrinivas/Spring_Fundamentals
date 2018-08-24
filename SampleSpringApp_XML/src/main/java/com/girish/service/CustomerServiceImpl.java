package com.girish.service;

import com.girish.model.Customer;
import com.girish.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository repository;

    public CustomerServiceImpl() {

    }

    // Constructor injection
    // Autowire by constructor
    public CustomerServiceImpl(CustomerRepository repository) {
        System.out.println("Using Constructor injection!...");
        this.repository = repository;
    }

    // Setter injection
    // Autowire by Type
    public void setRepository(CustomerRepository repository) {
        System.out.println("Using Setter injection!...");
        this.repository = repository;
    }

    // Autowire by Name
    public void setCustomerRepository(CustomerRepository repository) {
        System.out.println("Using Setter injection!...");
        this.repository = repository;
    }

    @Override
    public List<Customer> findAll() {

        return repository.findAll();
    }
}
