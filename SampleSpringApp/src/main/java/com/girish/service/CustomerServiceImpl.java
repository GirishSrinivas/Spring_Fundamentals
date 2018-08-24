package com.girish.service;

import com.girish.model.Customer;
import com.girish.repository.CustomerRepository;
import com.girish.repository.HibernateCustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepository();


    public CustomerServiceImpl() {

    }

    @Override
    public List<Customer> findAll() {

        return customerRepository.findAll();
    }
}
