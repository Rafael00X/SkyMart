package com.skymart.productservice.service;

import com.skymart.productservice.entity.Product;

public interface ProductService {
    Product createProduct(Product product);
    Product getProduct(Long id);
}
