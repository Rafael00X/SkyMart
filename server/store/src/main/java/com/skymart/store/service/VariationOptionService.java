package com.skymart.store.service;

import com.skymart.store.entity.VariationOption;

public interface VariationOptionService {
    VariationOption createVariationOption(VariationOption variationOption);

    VariationOption getVariationOptionById(Integer id);
}
