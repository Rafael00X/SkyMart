package com.skymart.userservice.userdetails.repository;

import com.skymart.userservice.userdetails.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
