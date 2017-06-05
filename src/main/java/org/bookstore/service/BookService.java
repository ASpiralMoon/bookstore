package org.bookstore.service;

import org.bookstore.dto.Book;
import org.bookstore.dto.ResponseData;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 16:57
 * @modify ...
 */
public interface BookService {

    ResponseData<Book> queryBookList(Book book);

    ResponseData<Book> addBook(Book book);

    ResponseData<Book> alterBookAdmin(Book book);

    ResponseData<Book> alterBookShops(Book book);

    ResponseData<Book> delBook(int bookId);
}
