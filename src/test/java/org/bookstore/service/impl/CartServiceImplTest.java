package org.bookstore.service.impl;

import org.bookstore.dto.Cart;
import org.bookstore.dto.ResponseData;
import org.bookstore.service.CartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestBody;

import static org.junit.Assert.*;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 14:22
 * @modify ...
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class CartServiceImplTest {

    @Autowired
    private CartService cartService;

    @Test
    public void queryCart() throws Exception {
        ResponseData<Cart> responseData = cartService.queryCartInfo(1);
        System.out.println(responseData);
    }

    @Test
    public void addCart() throws Exception {
        Cart cart = new Cart();
        cart.setUserId(1);
        cart.setBookId(2);
        ResponseData<Cart> responseData = cartService.addCart(cart);
        System.out.println(responseData);
    }

    @Test
    public void alterCart() throws Exception {
        Cart cart = new Cart();
        cart.setUserId(1);
        cart.setBookId(2);
        cart.setQuantity((byte)3);
        ResponseData<Cart> responseData = cartService.alterCart(cart);
        System.out.println(responseData);
    }

    @Test
    public void delCart() throws Exception {
        ResponseData<Cart> responseData = cartService.delCart(2);
        System.out.println(responseData);
    }

}