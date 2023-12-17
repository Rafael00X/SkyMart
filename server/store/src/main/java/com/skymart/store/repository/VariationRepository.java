package com.skymart.store.repository;

import com.skymart.store.entity.Variation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariationRepository extends JpaRepository<Variation, Integer> {
}
