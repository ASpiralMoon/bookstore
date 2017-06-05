package org.bookstore.service.impl;

import org.bookstore.dao.TypeDao;
import org.bookstore.dto.ResponseData;
import org.bookstore.dto.Type;
import org.bookstore.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 0:34
 * @modify ...
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;

    /**
     * 查询所有分类
     *
     * @return
     */
    @Override
    public ResponseData<Type> queryType() {
        return new ResponseData<Type>(true, typeDao.queryType(null));
    }

    @Override
    public ResponseData<Type> addType(String typeName) {
        List<Type> types = typeDao.queryType(typeName);
        if (!types.isEmpty()) {
            return new ResponseData<Type>(false, "已存在相同的分类");
        }
        int i = typeDao.addType(typeName);
        if (i != 0) {
            return new ResponseData<Type>(true, "添加分类成功");
        }
        return null;
    }

    @Override
    public ResponseData<Type> delType(byte typeId) {
        int i = typeDao.delType(typeId);
        if (i != 0) {
            return new ResponseData<Type>(true, "删除分类成功");
        }
        return new ResponseData<Type>(false, "删除分类失败,不存在该分类");
    }
}
