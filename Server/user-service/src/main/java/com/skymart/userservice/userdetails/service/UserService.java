package com.skymart.userservice.userdetails.service;

import com.skymart.userservice.userdetails.entity.User;

public interface UserService {
    User createUser(User user);
    User getUser(long id);
}
