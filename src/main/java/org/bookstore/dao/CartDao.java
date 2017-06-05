package org.bookstore.dao;

import org.apache.ibatis.annotations.Param;
import org.bookstore.dto.Cart;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 13:49
 * @modify ...
 */
public interface CartDao {

    /**
     * 查询购物车信息
     *
     * @param cart cart dto
     * @return
     */
    List<Cart> queryCart(Cart cart);

    /**
     * 查询所有购物车信息
     *
     * @param userId userId
     * @return
     */
    List<Cart> queryCartInfo(@Param("userId") int userId);

    /**
     * 新增购物车信息
     *
     * @param cart cart dto
     * @return
     */
    int addCart(Cart cart);

    /**
     * 修改图书数量
     *
     * @param cart cart dto
     * @return
     */
    int alterCart(Cart cart);

    /**
     * 删除购物车信息
     *
     * @param cartId cartId
     * @return
     */
    int delCart(@Param("cartId") Integer cartId);
}
