package com.skymart.inventoryservice.inventory.repository;

import com.skymart.inventoryservice.inventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
