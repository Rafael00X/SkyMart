package com.skymart.store.repository;

import com.skymart.store.entity.ProductStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInventoryRepository extends JpaRepository<ProductStock, Integer> {
}
