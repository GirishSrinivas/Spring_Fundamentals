package com.girish.application;

import com.girish.repository.CustomerRepository;
import com.girish.repository.HibernateCustomerRepository;
import com.girish.service.CustomerService;
import com.girish.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = {"com.girish"})
@PropertySource("app.properties")
public class AppConfig {

    // for reading properties file
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    // this below code is not needed if you are using the @ComponentScan annotation

//    @Bean("customerService")
//    public CustomerService getCustomerService() {
//        // constructor injection
//        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
//
//        // setter injection
//        // CustomerServiceImpl customerService = new CustomerServiceImpl();
//        // customerService.setCustomerRepository(getCustomerRepository());
//        return customerService;
//    }
//
//
//    @Bean("customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepository();
//    }
}
