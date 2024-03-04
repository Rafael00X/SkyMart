package com.skymart.userservice.userdetails.repository;

import com.skymart.userservice.userdetails.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
