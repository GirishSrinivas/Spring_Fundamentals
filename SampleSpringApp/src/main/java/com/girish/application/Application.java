package com.girish.application;

import com.girish.service.CustomerService;
import com.girish.service.CustomerServiceImpl;

public class Application {
    public static void main(String[] args) {

        CustomerService service =  new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName() + " " + service.findAll().get(0).getLastName());
    }
}
