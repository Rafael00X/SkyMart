package com.skymart.inventoryservice.inventory.service;

import com.skymart.inventoryservice.inventory.entity.Product;
import com.skymart.inventoryservice.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.findById(id).orElse(null);
    }
}
