package org.bookstore.service.impl;

import org.bookstore.dao.AddressDao;
import org.bookstore.dto.Address;
import org.bookstore.dto.ResponseData;
import org.bookstore.service.AddressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.nio.file.AccessDeniedException;

import static org.junit.Assert.*;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 12:08
 * @modify ...
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class AddressServiceImplTest {

    @Autowired
    private AddressService addressService;

    @Autowired
    private AddressDao addressDao;

    @Test
    public void queryAddress() throws Exception {
        Address address = new Address();
        address.setUserId(1);
        ResponseData<Address> responseData = addressService.queryAddress(address);
        System.out.println(responseData);
    }

    @Test
    public void addAddress() throws Exception {
        Address address = new Address();
        address.setUserId(1);
        address.setAddress("dafasdfsa");
        address.setContactPerson("dafasfaf");
        address.setPhone("dafdadsaf");
        ResponseData<Address> responseData = addressService.addAddress(address);
        System.out.println(responseData);
    }

    @Test
    public void alterAddress() throws Exception {
        Address address = new Address();
        address.setAddressId(3);
        address.setUserId(1);
        address.setAddress("dafasdfsa12312");
        address.setContactPerson("dafasfaf312311");
        address.setPhone("dafdadsaf31231");
        ResponseData<Address> responseData = addressService.alterAddress(address);
        System.out.println(responseData);
    }

    @Test
    public void delAddress() throws Exception {
        ResponseData<Address> responseData = addressService.delAddress(2);
        System.out.println(responseData);
    }

}