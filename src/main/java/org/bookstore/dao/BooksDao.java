package org.bookstore.dao;

import org.bookstore.dto.Books;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 16:16
 * @modify ...
 */
public interface BooksDao {

    /**
     * 查询书籍
     *
     * @param books Books dto
     * @return
     */
    List<Books> queryBooks(Books books);

    /**
     * 新增书籍
     *
     * @param books Books dto
     * @return
     */
    int addBooks(Books books);
}
