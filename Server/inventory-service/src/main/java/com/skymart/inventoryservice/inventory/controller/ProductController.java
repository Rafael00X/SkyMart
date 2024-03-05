package com.skymart.inventoryservice.inventory.controller;

import com.skymart.inventoryservice.inventory.entity.Product;
import org.springframework.web.bind.annotation.*;

@RestController("products")
public interface ProductController {
    @PostMapping("/")
    void createProduct(@RequestBody Product product);
    @GetMapping("/{id}")
    Product getProduct(@PathVariable long id);

}
