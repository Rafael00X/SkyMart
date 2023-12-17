package com.skymart.store.repository;

import com.skymart.store.entity.ProductCombination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCombinationRepository extends JpaRepository<ProductCombination, Integer> {
}
