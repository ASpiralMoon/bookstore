package org.bookstore.dao;

import org.apache.ibatis.annotations.Param;
import org.bookstore.dto.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 0:34
 * @modify ...
 */
public interface TypeDao {

    /**
     * 查询分类
     *
     * @param typeName 分类名称
     * @return
     */
    List<Type> queryType(@Param("typeName") String typeName);

    /**
     * 增加分类
     *
     * @param typeName 分类名称
     * @return 影响数据库记录行数
     */
    int addType(@Param("typeName") String typeName);

    /**
     * 删除分类
     *
     * @param typeId 分类id
     * @return 影响数据库记录行数
     */
    int delType(@Param("typeId") byte typeId);
}
