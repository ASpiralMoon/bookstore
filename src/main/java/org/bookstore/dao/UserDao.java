package org.bookstore.dao;

import org.apache.ibatis.annotations.Param;
import org.bookstore.dto.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/4 14:09
 * @modify ...
 */
public interface UserDao {

    /**
     * 用户注册
     *
     * @param user 用户dto
     * @return 影响数据库记录行数
     */
    int userRegister(User user);

    /**
     * 查询用户信息
     *
     * @param user 用户dto
     * @return 用户dto
     */
    List<User> queryUser(User user);

    /**
     * 完善用户信息
     *
     * @param user 用户dto
     * @return 影响数据库记录行数
     */
    int perfectedInfo(User user);

    /**
     * 增加登录失败次数
     *
     * @param userId user_id
     * @return 影响数据库记录行数
     */
    int increaseTimes(@Param("userId") int userId);

    /**
     * 锁定用户（status = -1）
     *
     * @param userId user_id
     * @return 影响数据库记录行数
     */
    int lockUser(@Param("userId") int userId);

    /**
     * 清空密码错误次数，解锁用户
     *
     * @param userId user_id
     * @return 影响数据库记录行数
     */
    int unlockedUser(@Param("userId") int userId);

    /**
     * 删除用户方法
     *
     * @param userId user_id
     * @return
     */
    int delUser(@Param("userId") int userId);
}
