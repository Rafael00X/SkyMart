package com.skymart.cartservice.service;

import com.skymart.cartservice.entity.Cart;
import com.skymart.cartservice.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Override
    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart getCart(long id) {
        return cartRepository.findById(id).orElse(null);
    }
}
