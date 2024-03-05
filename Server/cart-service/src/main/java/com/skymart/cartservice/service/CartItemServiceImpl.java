package com.skymart.cartservice.service;

import com.skymart.cartservice.entity.CartItem;
import com.skymart.cartservice.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CartItemServiceImpl implements CartItemService {
    @Autowired
    private CartItemRepository cartItemRepository;
    @Override
    public CartItem createCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    @Override
    public CartItem getCartItem(long id) {
        return cartItemRepository.findById(id).orElse(null);
    }
}
