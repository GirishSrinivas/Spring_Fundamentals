package com.girish.application;

import com.girish.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        System.out.println("Inside SampleSpringApp_Java!...");

        System.out.println(service.findAll().get(0).getFirstName() + " " + service.findAll().get(0).getLastName());
    }
}
