package org.bookstore.test;

import org.bookstore.utils.BankUtils;
import org.bookstore.utils.GetMD5Utils;
import org.junit.Test;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/5/24 16:19
 * @modify ...
 */
public class test1 {

    private final String salt = "dad;jfakl;jsdfl;ajds";

    @Test
    public void testMD5() {
        System.err.println(GetMD5Utils.getMD5("18571450406"));
    }

    @Test
    public void testBank() {
        System.err.println(BankUtils.getNameOfBank("6222023202054345284"));
    }

    @Test
    public void testBank1(){
        System.err.println(BankUtils.checkBankCard("6222023202054345284"));
    }

}
