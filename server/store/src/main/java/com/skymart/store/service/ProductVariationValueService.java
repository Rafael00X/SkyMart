package com.skymart.store.service;

import com.skymart.store.entity.ProductVariationValue;

public interface ProductVariationValueService {
    ProductVariationValue createProductVariationValue(ProductVariationValue productVariationValue);

    ProductVariationValue getProductVariationValueById(Integer id);
}
