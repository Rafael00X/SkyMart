package com.skymart.userservice.userdetails.controller;

import com.skymart.userservice.userdetails.entity.Address;
import com.skymart.userservice.userdetails.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController("user")
public interface UserController {
    @PostMapping("/")
    void createUser(@RequestBody User user);
    @GetMapping("/")
    User getUser(@RequestParam Long id);
}
