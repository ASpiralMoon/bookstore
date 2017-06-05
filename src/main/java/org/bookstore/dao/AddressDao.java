package org.bookstore.dao;

import org.apache.ibatis.annotations.Param;
import org.bookstore.dto.Address;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/4 23:50
 * @modify ...
 */
public interface AddressDao {

    /**
     * 根据用户id查询对应的收货地址
     *
     * @param address Address dto
     * @return
     */
    List<Address> queryAddress(Address address);

    /**
     * 增加收货地址
     *
     * @param address Address dto
     * @return
     */
    int addAddress(Address address);

    /**
     * 修改收货地址
     *
     * @param address Address dto
     * @return
     */
    int alterAddress(Address address);

    /**
     * 删除收获地址
     *
     * @param addressId 地址id
     * @return
     */
    int delAddress(@Param("addressId") int addressId);
}
