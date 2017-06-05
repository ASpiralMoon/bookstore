package org.bookstore.controller;

import org.bookstore.dto.Cart;
import org.bookstore.dto.ResponseData;
import org.bookstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 14:16
 * @modify ...
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @ResponseBody
    @RequestMapping("/queryCart")
    public ResponseData<Cart> queryCart(@RequestParam("userId") int userId){
        return cartService.queryCartInfo(userId);
    }

    @ResponseBody
    @RequestMapping("/addCart")
    public ResponseData<Cart> addCart(@RequestBody Cart cart) {
        return cartService.addCart(cart);
    }

    @ResponseBody
    @RequestMapping("/alterCart")
    public ResponseData<Cart> alterCart(@RequestBody Cart cart) {
        return cartService.addCart(cart);
    }

    @ResponseBody
    @RequestMapping("/delCart")
    public ResponseData<Cart> delCart(@RequestParam("cartId") int cartId) {
        return cartService.delCart(cartId);
    }
}
