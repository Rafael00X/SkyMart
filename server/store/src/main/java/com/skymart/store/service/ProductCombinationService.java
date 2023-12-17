package com.skymart.store.service;

import com.skymart.store.entity.ProductCombination;

public interface ProductCombinationService {
    ProductCombination createProductCombination(ProductCombination productCombination);

    ProductCombination getProductCombinationById(Integer id);
}
