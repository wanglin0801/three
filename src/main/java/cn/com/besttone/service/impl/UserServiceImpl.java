package cn.com.besttone.service.impl;

import cn.com.besttone.entity.Customer;
import cn.com.besttone.repository.CustomerRepository;
import cn.com.besttone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public int save(Customer user) {
        //userRepository.save(user);
        return 0;
    }
}
