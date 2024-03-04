package com.skymart.userservice.userdetails.controller;

import com.skymart.userservice.userdetails.entity.Address;
import com.skymart.userservice.userdetails.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressControllerImpl implements AddressController {
    @Autowired
    private AddressService addressService;
    @Override
    public void createAddress(Address address) {
        Address newAddress = addressService.createAddress(address);
    }

    @Override
    public Address getAddress(Long id) {
        return addressService.getAddress(id);
    }
}
