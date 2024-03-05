package com.skymart.cartservice.controller;

import com.skymart.cartservice.entity.Cart;
import org.springframework.web.bind.annotation.*;

@RestController("carts")
public interface CartController {
    @PostMapping("/")
    void createCart(@RequestBody Cart cart);
    @GetMapping("/{id}")
    Cart getCart(@RequestParam long id);
}
