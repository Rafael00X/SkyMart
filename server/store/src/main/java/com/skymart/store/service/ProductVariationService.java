package com.skymart.store.service;

import com.skymart.store.entity.ProductVariation;

public interface ProductVariationService {
    ProductVariation createProductVariation(ProductVariation productVariation);

    ProductVariation getProductVariationById(Integer id);
}
