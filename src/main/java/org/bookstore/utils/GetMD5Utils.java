package org.bookstore.utils;

import org.springframework.util.DigestUtils;

/**
 * 加盐加密工具类
 */
public class GetMD5Utils {

    // 定义一个盐值
    private final static String salt = "hfoadufnashf;kdjasl;fk";

    /**
     * 加盐加密方法
     *
     * @param s 需要加密的字符串
     * @return 加密后的字符串
     */
    public static String getMD5(String s) {
        String base = s + "/" + salt;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }
}
