package org.bookstore.dao;

import org.apache.ibatis.annotations.Param;
import org.bookstore.dto.Book;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 15:57
 * @modify ...
 */
public interface BookDao {

    /**
     * 查询书籍列表
     *
     * @param book Book dto
     * @return
     */
    List<Book> queryBookList(Book book);

    /**
     * 新增书籍
     *
     * @param book Book dto
     * @return
     */
    int addBook(Book book);

    /**
     * 修改书籍信息
     *
     * @param book Book dto
     * @return
     */
    int alterBook(Book book);

    /**
     * 删除书籍
     *
     * @param bookId bookId
     * @return
     */
    int delBook(@Param("bookId") int bookId);
}
