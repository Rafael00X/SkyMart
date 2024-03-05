package com.skymart.cartservice.service;

import com.skymart.cartservice.entity.Cart;

public interface CartService {
    Cart createCart(Cart cart);
    Cart getCart(long id);
}
