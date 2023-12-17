package com.skymart.store.service;

import com.skymart.store.entity.Product;

public interface ProductService {

    Product createProduct(Product product);

    Product getProductById(Integer id);
}
