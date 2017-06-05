package org.bookstore.service.impl;

import org.bookstore.dto.Book;
import org.bookstore.dto.ResponseData;
import org.bookstore.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 17:36
 * @modify ...
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class BookServiceImplTest {

    @Autowired
    private BookService bookService;

    @Test
    public void queryBookList() throws Exception {
        Book book = new Book();
//        book.setBookName("《时间简史");
//        book.setAuthor("史蒂芬");
//        book.setShopsId(1);
        ResponseData<Book> responseData = bookService.queryBookList(book);
        System.out.println(responseData);
    }

    @Test
    public void addBook() throws Exception {
        Book book = new Book();
        book.setBookName("asd");
        book.setAuthor("da");
        book.setPrice(1123.12);
        book.setInventory(12);
        book.setPicture("dad");
        book.setShopsId(1);
        book.setTypeId((byte) 2);
        ResponseData<Book> responseData = bookService.addBook(book);
        System.out.println(responseData);
    }

    @Test
    public void alterBookShops() throws Exception {
        Book book = new Book();
        book.setBookId(2);
        book.setBookName("asd1");
        book.setAuthor("da1");
        book.setPrice(1123.12);
        book.setInventory(12);
        book.setPicture("dad");
        book.setShopsId(1);
        book.setTypeId((byte) 2);
        ResponseData<Book> responseData = bookService.alterBookShops(book);
        System.out.println(responseData);
    }

    @Test
    public void alterBookAdmin() throws Exception {
        Book book = new Book();
        book.setBookId(3);
        book.setStatus((byte) 1);
        book.setApprovalComments("审批通过");
        book.setApprovalAdmin(1);
        ResponseData<Book> responseData = bookService.alterBookAdmin(book);
        System.out.println(responseData);
    }

    @Test
    public void delBook() throws Exception {
        ResponseData<Book> responseData = bookService.delBook(2);
        System.out.println(responseData);
    }

}