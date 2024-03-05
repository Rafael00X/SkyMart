package com.skymart.inventoryservice.inventory.service;

import com.skymart.inventoryservice.inventory.entity.Product;

public interface ProductService {
    Product createProduct(Product product);
    Product getProduct(long id);
}
