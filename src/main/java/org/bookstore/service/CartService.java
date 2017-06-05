package org.bookstore.service;

import org.bookstore.dto.Cart;
import org.bookstore.dto.ResponseData;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 14:06
 * @modify ...
 */
public interface CartService {

    ResponseData<Cart> queryCartInfo(int userId);

    ResponseData<Cart> addCart(Cart cart);

    ResponseData<Cart> alterCart(Cart cart);

    ResponseData<Cart> delCart(int cartId);
}
