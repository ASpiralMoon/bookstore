package org.bookstore.service.impl;

import org.bookstore.dao.CartDao;
import org.bookstore.dto.Cart;
import org.bookstore.dto.ResponseData;
import org.bookstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 14:06
 * @modify ...
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public ResponseData<Cart> queryCartInfo(int userId) {
        return new ResponseData<Cart>(true, cartDao.queryCartInfo(userId));
    }

    @Override
    public ResponseData<Cart> addCart(Cart cart) {
        List<Cart> carts = cartDao.queryCart(cart);
        if (!carts.isEmpty()) {
            return new ResponseData<Cart>(false, "已经添加过相同书籍啦!");
        }
        int i = cartDao.addCart(cart);
        if (i != 0) {
            return new ResponseData<Cart>(true, "书籍已成功添加至进购物车");
        }
        return null;
    }

    @Override
    public ResponseData<Cart> alterCart(Cart cart) {
        int i = cartDao.alterCart(cart);
        if (i != 0) {
            return new ResponseData<Cart>(true, "修改购物车数据成功");
        }
        return null;
    }

    @Override
    public ResponseData<Cart> delCart(int cartId) {
        int i = cartDao.delCart(cartId);
        if (i != 0) {
            return new ResponseData<Cart>(true, "已成功删除该物品");
        }
        return new ResponseData<Cart>(false, "购物车已不存在该物品");
    }
}
