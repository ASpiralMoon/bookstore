package org.bookstore.controller;

import org.bookstore.dto.Address;
import org.bookstore.dto.ResponseData;
import org.bookstore.service.AddressService;
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
 * @time 2017/6/5 0:25
 * @modify ...
 */
@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @ResponseBody
    @RequestMapping("/queryAddress")
    public ResponseData<Address> queryAddress(@RequestBody Address address) {
        return addressService.queryAddress(address);
    }

    @ResponseBody
    @RequestMapping("/addAddress")
    public ResponseData<Address> addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    @ResponseBody
    @RequestMapping("/alterAddress")
    public ResponseData<Address> alterAddress(@RequestBody Address address) {
        return addressService.alterAddress(address);
    }

    @ResponseBody
    @RequestMapping("/delAddress")
    public ResponseData<Address> delAddress(@RequestParam("addressId") int addressId) {
        return addressService.delAddress(addressId);
    }
}
