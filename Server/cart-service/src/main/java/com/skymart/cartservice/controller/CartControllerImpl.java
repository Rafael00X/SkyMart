package com.skymart.cartservice.controller;

import com.skymart.cartservice.entity.Cart;
import com.skymart.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartControllerImpl implements CartController {
    @Autowired
    private CartService cartService;
    @Override
    public void createCart(Cart cart) {
        Cart newCart = cartService.createCart(cart);
    }

    @Override
    public Cart getCart(long id) {
        return cartService.getCart(id);
    }
}
