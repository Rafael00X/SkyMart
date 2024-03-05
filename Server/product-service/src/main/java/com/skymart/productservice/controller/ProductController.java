package com.skymart.productservice.controller;

import com.skymart.productservice.entity.Product;
import org.springframework.web.bind.annotation.*;

@RestController("/products")
public interface ProductController {
    @PostMapping("/")
    void createProduct(@RequestBody Product product);
    @GetMapping("/{id}")
    Product getProduct(@RequestParam long id);
}
