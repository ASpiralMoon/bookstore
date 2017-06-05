package org.bookstore.service.impl;

import org.bookstore.dao.UserDao;
import org.bookstore.dto.ResponseData;
import org.bookstore.dto.User;
import org.bookstore.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/4 16:05
 * @modify ...
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class UserServiceImplTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Test
    public void userRegister() throws Exception {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setRole((byte) 0);
        ResponseData<User> responseData = userService.userRegister(user);
        System.err.println(responseData);
    }

    @Test
    public void queryUser() throws Exception {
        User user = new User();
        List<User> list = userDao.queryUser(user);
        System.out.println(list);
        ResponseData<User> responseData = userService.queryUser(user);
        System.out.println(responseData);
    }

    @Test
    public void userLogin() throws Exception {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        ResponseData<User> responseData = userService.userLogin(user);
        System.err.println(responseData);
    }

    @Test
    public void perfectedInfo() throws Exception{
        User user = new User();
        user.setUserId(1);
        user.setUsername("admin");
        user.setPassword("admin");
        user.setNickname("aaaaaaaaa");
        user.setBankCard("6222023202054345284");
        user.setPaymentPassword("123456");
        user.setName("abc");
        user.setEmail("532640001@qq.com");
        user.setPasswordQuestion("你的生日是?");
        user.setAnswer("19950406");
        ResponseData<User> responseData = userService.perfectedInfo(user);
        System.out.println(responseData);
    }

    @Test
    public void delUser() throws Exception{
        ResponseData<User> responseData = userService.delUser(2);
        System.out.println(responseData);
    }

}