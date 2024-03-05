package com.skymart.productservice.service;

import com.skymart.productservice.entity.Product;
import com.skymart.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
