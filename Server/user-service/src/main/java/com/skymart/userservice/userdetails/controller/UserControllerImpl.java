package com.skymart.userservice.userdetails.controller;

import com.skymart.userservice.userdetails.entity.Address;
import com.skymart.userservice.userdetails.entity.User;
import com.skymart.userservice.userdetails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserControllerImpl implements UserController {
    @Autowired
    private UserService userService;
    @Override
    public void createUser(User user) {
        User newUser = userService.createUser(user);
    }

    @Override
    public User getUser(Long id) {
        return userService.getUser(id);
    }
}
