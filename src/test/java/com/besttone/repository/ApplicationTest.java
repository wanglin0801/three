package com.besttone.repository;

import com.besttone.entity.Customer;
import groovy.util.logging.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@ImportAutoConfiguration
public class ApplicationTest {

    private final Logger logger = LoggerFactory.getLogger(ApplicationTest.class);
    @Test
    public void testExample() throws Exception {

        logger.info("start...");
        System.out.println("");
        Customer user = new Customer();
        user.setFirstName("david");
        Assert.assertNotNull(user);
        logger.info("end...{}",user.getFirstName());


    }
}
