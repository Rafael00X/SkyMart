package com.skymart.store.repository;

import com.skymart.store.entity.ProductVariation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductVariationRepository extends JpaRepository<ProductVariation, Integer> {
}
