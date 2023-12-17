package com.skymart.store.service;

import com.skymart.store.entity.Variation;

public interface VariationService {
    Variation createVariation(Variation variation);

    Variation getVariationById(Integer id);
}
