package org.bookstore.service.impl;

import org.bookstore.dao.TypeDao;
import org.bookstore.dto.ResponseData;
import org.bookstore.dto.Type;
import org.bookstore.service.TypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 12:51
 * @modify ...
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class TypeServiceImplTest {

    @Autowired
    private TypeDao typeDao;

    @Autowired
    private TypeService typeService;

    @Test
    public void queryType() throws Exception {
        System.out.println(typeService.queryType());
    }

    @Test
    public void addType() throws Exception {
        ResponseData<Type> responseData = typeService.addType("教育1");
        System.out.println(responseData);
    }

    @Test
    public void delType() throws Exception {
        ResponseData<Type> responseData = typeService.delType((byte) 7);
        System.out.println(responseData);
    }

}