package com.skymart.productservice.controller;

import com.skymart.productservice.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/products")
public interface ProductController {
    @PostMapping("/")
    void createProduct(Product product);
    @GetMapping("/{id}")
    Product getProduct(long id);
}
