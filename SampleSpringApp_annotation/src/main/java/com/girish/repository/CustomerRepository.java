package com.girish.repository;

import com.girish.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
