package com.skymart.userservice.userdetails.controller;

import com.skymart.userservice.userdetails.entity.Address;
import org.springframework.web.bind.annotation.*;

@RestController("address")
public interface AddressController {
    @PostMapping("/")
    void createAddress(@RequestBody Address address);
    @GetMapping("/")
    Address getAddress(@RequestParam Long id);
}
