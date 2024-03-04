package com.skymart.userservice.userdetails.service;

import com.skymart.userservice.userdetails.entity.Address;
import com.skymart.userservice.userdetails.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address getAddress(long id) {
        return addressRepository.findById(id).orElse(null);
    }
}
