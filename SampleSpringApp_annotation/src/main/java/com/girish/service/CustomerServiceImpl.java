package com.girish.service;

import com.girish.model.Customer;
import com.girish.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    // Autowiring at member level
    // for member injection
    @Autowired
    private CustomerRepository customerRepository;


    public CustomerServiceImpl() {

    }

    // Autowiring at constructor level
    // for constructor injection
    // @Autowired
//    public CustomerServiceImpl(CustomerRepository customerRepository) {
//        System.out.println("Inside Constructor injection!...");
//        this.customerRepository = customerRepository;
//    }

    // Autowiring at setter level
    // for setter injection
    // @Autowired
//    public void setCustomerRepository(CustomerRepository customerRepository) {
//        System.out.println("Using Setter injection!...");
//        this.customerRepository = customerRepository;
//    }

    @Override
    public List<Customer> findAll() {

        return customerRepository.findAll();
    }
}
