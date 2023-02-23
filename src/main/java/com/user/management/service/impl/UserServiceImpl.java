package com.user.management.service.impl;

import com.user.management.model.User;
import com.user.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    public User getUserService(String id){

    }
    public User createUserService(User user){

    }
    public User updateUserService(String id, User user){

    }
    public User deleteUserService(String id){

    }
}
