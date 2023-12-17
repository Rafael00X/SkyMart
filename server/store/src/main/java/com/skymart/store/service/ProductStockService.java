package com.skymart.store.service;

import com.skymart.store.entity.ProductStock;

public interface ProductStockService {
    ProductStock createProductStock(ProductStock productStock);

    ProductStock getProductStockById(Integer id);
}
