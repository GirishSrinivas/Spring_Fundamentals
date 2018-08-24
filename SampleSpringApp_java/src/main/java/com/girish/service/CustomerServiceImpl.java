package com.girish.service;

import com.girish.model.Customer;
import com.girish.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public CustomerServiceImpl() {

    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Using constructor injection inside CustomerServiceImpl()!...");
        this.customerRepository = customerRepository;
    }


    // setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Using setter injection inside CustomerServiceImpl()!...");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {

        return customerRepository.findAll();
    }
}
