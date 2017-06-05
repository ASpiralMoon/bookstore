package org.bookstore.controller;

import org.bookstore.dto.ResponseData;
import org.bookstore.dto.User;
import org.bookstore.service.UserService;
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
 * @time 2017/6/4 17:44
 * @modify ...
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/userRegister")
    public ResponseData<User> userRegister(@RequestBody User user) {
        return userService.userRegister(user);
    }

    @ResponseBody
    @RequestMapping("/queryUser")
    public ResponseData<User> queryUser(@RequestBody User user) {
        return userService.queryUser(user);
    }

    @ResponseBody
    @RequestMapping("/userLogin")
    public ResponseData<User> userLogin(@RequestBody User user) {
        return userService.userLogin(user);
    }

    @ResponseBody
    @RequestMapping("/perfectedInfo")
    public ResponseData<User> perfectedInfo(@RequestBody User user) {
        return userService.perfectedInfo(user);
    }

    @ResponseBody
    @RequestMapping("/delUser")
    public ResponseData<User> delUser(@RequestParam("userId") int userId) {
        return userService.delUser(userId);
    }
}
