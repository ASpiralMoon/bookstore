package org.bookstore.service.impl;

import org.bookstore.dao.AddressDao;
import org.bookstore.dto.Address;
import org.bookstore.dto.ResponseData;
import org.bookstore.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 0:07
 * @modify ...
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;

    @Override
    public ResponseData<Address> queryAddress(Address address) {
        return new ResponseData<Address>(true, addressDao.queryAddress(address));
    }

    @Override
    public ResponseData<Address> addAddress(Address address) {
        List<Address> addresses = addressDao.queryAddress(address);
        if (!addresses.isEmpty()) {
            return new ResponseData<Address>(false, "存在相同的收货地址");
        }
        int i = addressDao.addAddress(address);
        if (i != 0) {
            return new ResponseData<Address>(true, "添加收货地址成功");
        }
        return null;
    }

    @Override
    public ResponseData<Address> alterAddress(Address address) {
        List<Address> addresses = addressDao.queryAddress(address);
        if (!addresses.isEmpty()) {
            return new ResponseData<Address>(false, "存在相同的收货地址");
        }
        int i = addressDao.alterAddress(address);
        if (i != 0) {
            return new ResponseData<Address>(true, "修改收货地址信息成功");
        }
        return new ResponseData<Address>(false, "修改收货地址信息失败");
    }

    @Override
    public ResponseData<Address> delAddress(int addressId) {
        int i = addressDao.delAddress(addressId);
        if (i != 0) {
            return new ResponseData<Address>(true, "删除收货地址信息成功");
        }
        return new ResponseData<Address>(false, "不存在该收货地址");
    }
}
