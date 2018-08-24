package com.girish.repository;

import com.girish.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepository implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();

        customer.setFirstName("Girish");
        customer.setLastName("Srinivas");
        customers.add(customer);

        return customers;
    }
}
