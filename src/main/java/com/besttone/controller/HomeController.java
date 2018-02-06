package com.besttone.controller;

import com.besttone.entity.Customer;
import com.besttone.service.amqp.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private MessageProducer messageProducer;

    private final Logger log = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping("/page")
    public String home(){
        Customer customer = new Customer() ;
        customer.setFirstName("Iverson");
        messageProducer.sendMessage(customer);
        log.info("message completed {}",customer.getFirstName());
        return "home";
    }
}
