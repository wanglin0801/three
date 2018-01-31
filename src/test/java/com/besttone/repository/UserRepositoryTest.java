/*package com.besttone.repository;

import com.besttone.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {com.besttone.repository.JpaConfiguration.class})
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)

public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void initData(){
        User user = new User();
        userRepository.save(user);
    }

}*/

