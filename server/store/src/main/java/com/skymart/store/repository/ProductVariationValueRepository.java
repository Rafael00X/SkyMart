package com.skymart.store.repository;

import com.skymart.store.entity.ProductVariationValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductVariationValueRepository extends JpaRepository<ProductVariationValue, Integer> {
}
