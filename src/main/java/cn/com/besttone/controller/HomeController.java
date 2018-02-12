package cn.com.besttone.controller;

import cn.com.besttone.entity.Customer;
import cn.com.besttone.service.amqp.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private MessageProducer messageProducer;
    @Autowired
    private MessageProducer messageProducer1;

    private final Logger log = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping("/page")
    public String home(){

        for (int i = 0; i < 10; i++) {
            Customer customer = new Customer() ;
            customer.setFirstName("Iverson"+i);
            messageProducer.sendMessage(customer);
            messageProducer1.sendMessage(customer);
            log.info("message completed {}",customer.getFirstName());

        }
        return "home";
    }
}
