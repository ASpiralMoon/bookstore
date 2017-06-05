package org.bookstore.service;

import org.bookstore.dto.Address;
import org.bookstore.dto.ResponseData;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 0:07
 * @modify ...
 */
public interface AddressService {

    ResponseData<Address> queryAddress(Address address);

    ResponseData<Address> addAddress(Address address);

    ResponseData<Address> alterAddress(Address address);

    ResponseData<Address> delAddress(int addressId);
}
