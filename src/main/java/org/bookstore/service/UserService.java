package org.bookstore.service;


import org.bookstore.dto.ResponseData;
import org.bookstore.dto.User;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/4 14:09
 * @modify ...
 */
public interface UserService {

    ResponseData<User> userRegister(User user);

    ResponseData<User> queryUser(User user);

    ResponseData<User> userLogin(User user);

    ResponseData<User> perfectedInfo(User user);

    ResponseData<User> delUser(int userId);
}
