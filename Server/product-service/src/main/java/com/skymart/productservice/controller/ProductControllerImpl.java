package com.skymart.productservice.controller;

import com.skymart.productservice.entity.Product;
import com.skymart.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductControllerImpl implements ProductController {
    @Autowired
    private ProductService productService;
    @Override
    public void createProduct(Product product) {
        Product newProduct = productService.createProduct(product);
    }

    @Override
    public Product getProduct(long id) {
        return productService.getProduct(id);
    }
}
