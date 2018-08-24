package com.girish.application;

import com.girish.service.CustomerService;
import com.girish.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        System.out.println("Inside SampleSpringApp_Annotation project");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = context.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName() + " " + service.findAll().get(0).getLastName());
    }
}
