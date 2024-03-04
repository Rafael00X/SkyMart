package com.skymart.userservice.userdetails.service;

import com.skymart.userservice.userdetails.entity.Address;

public interface AddressService {
    Address createAddress(Address address);
    Address getAddress(long id);
}
