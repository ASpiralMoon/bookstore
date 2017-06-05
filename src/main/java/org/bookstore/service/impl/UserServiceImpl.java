package org.bookstore.service.impl;

import org.bookstore.dao.UserDao;
import org.bookstore.dto.ResponseData;
import org.bookstore.dto.User;
import org.bookstore.service.UserService;
import org.bookstore.utils.BankUtils;
import org.bookstore.utils.GetMD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/4 14:09
 * @modify ...
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 用户注册方法
     *
     * @param user user dto
     * @return
     */
    @Override
    public ResponseData<User> userRegister(User user) {
        List<User> users;
        if (user != null) {
            users = userDao.queryUser(user);
            if (!users.isEmpty()) { //存在相同用户名的用户
                return new ResponseData<User>(false, "用户已存在");
            } else {
                String password = user.getPassword();
                user.setPassword(GetMD5Utils.getMD5(password));
                int i = userDao.userRegister(user);
                if (i != 0) {
                    return new ResponseData<User>(true, users.get(0), "注册成功");
                }
            }
        }
        return null;
    }

    /**
     * 用户查询方法
     *
     * @param user user dto
     * @return
     */
    @Override
    public ResponseData<User> queryUser(User user) {
        return new ResponseData<User>(true, userDao.queryUser(user));
    }

    /**
     * 用户登录方法
     *
     * @param user user dto
     * @return
     */
    @Override
    public ResponseData<User> userLogin(User user) {
        List<User> users;
        if (user != null) {
            users = userDao.queryUser(user);
            if (users.isEmpty()) { //查询不到数据,用户名不存在
                return new ResponseData<User>(false, "用户名不存在");
            } else {
                String password = user.getPassword();
                if (!GetMD5Utils.getMD5(password).equals(users.get(0).getPassword())) { //密码不匹配
                    userDao.increaseTimes(users.get(0).getUserId());
                    if (users.get(0).getLoginFailed() == 5) { //连续登录失败次数超过5次
                        /* 锁定用户 */
                        userDao.lockUser(users.get(0).getUserId());
                    }
                    return new ResponseData<User>(false, "密码错误");
                } else {
                    if ((byte) -1 == users.get(0).getStatus()) { //状态为被锁定
                        return new ResponseData<User>(false, "密码连续错误5次，用户已被锁定");
                    } else {
                        // 清空密码连续错误次数
                        userDao.unlockedUser(users.get(0).getUserId());
                        return new ResponseData<User>(true, users.get(0), "登录成功");
                    }
                }
            }
        }
        return null;
    }

    /**
     * 用户完善信息方法
     *
     * @param user user dto
     * @return
     */
    @Override
    public ResponseData<User> perfectedInfo(User user) {
        String bankCard = user.getBankCard();
        if (bankCard != null && !BankUtils.checkBankCard(bankCard)) {
            return new ResponseData<User>(false, "银行卡号不合法");
        }
        int i = userDao.perfectedInfo(user);
        if (i != 0) {
            List<User> list = userDao.queryUser(user);
            return new ResponseData<User>(true, list.get(0), BankUtils.getNameOfBank(bankCard));
        }
        return null;
    }

    @Override
    public ResponseData<User> delUser(int userId) {
        int i = userDao.delUser(userId);
        if (i != 0) {
            return new ResponseData<User>(true, "删除成功");
        }
        return new ResponseData<User>(false, "删除失败,用户不存在");
    }
}
