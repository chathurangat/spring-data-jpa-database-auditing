package com.springbootdev.examples.jpa.auditing.service.impl;

import com.springbootdev.examples.jpa.auditing.model.User;
import com.springbootdev.examples.jpa.auditing.repository.UserRepository;
import com.springbootdev.examples.jpa.auditing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
}
