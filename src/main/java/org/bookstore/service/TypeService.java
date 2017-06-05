package org.bookstore.service;

import org.bookstore.dto.ResponseData;
import org.bookstore.dto.Type;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 0:34
 * @modify ...
 */
public interface TypeService {

    ResponseData<Type> queryType();

    ResponseData<Type> addType(String typeName);

    ResponseData<Type> delType(byte typeId);
}
