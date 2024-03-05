package com.skymart.cartservice.service;

import com.skymart.cartservice.entity.CartItem;

public interface CartItemService {
    CartItem createCartItem(CartItem cartItem);
    CartItem getCartItem(long id);
}
