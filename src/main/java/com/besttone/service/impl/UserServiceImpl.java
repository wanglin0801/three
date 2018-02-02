package com.besttone.service.impl;

import com.besttone.entity.User;
import com.besttone.repository.UserRepository;
import com.besttone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public int save(User user) {
        user.setName("w1");
        user.setState("x");
        userRepository.save(user);
        return 0;
    }
}
