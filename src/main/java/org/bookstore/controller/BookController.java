package org.bookstore.controller;

import org.bookstore.dto.Book;
import org.bookstore.dto.ResponseData;
import org.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 17:37
 * @modify ...
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @ResponseBody
    @RequestMapping("/queryBookList")
    public ResponseData<Book> queryBookList(@RequestBody Book book) {
        return bookService.queryBookList(book);
    }

    @ResponseBody
    @RequestMapping("/addBook")
    public ResponseData<Book> addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @ResponseBody
    @RequestMapping("/alterBookAdmin")
    public ResponseData<Book> alterBookAdmin(@RequestBody Book book) {
        return bookService.alterBookAdmin(book);
    }

    @ResponseBody
    @RequestMapping("/alterBookShops")
    public ResponseData<Book> alterBookShops(@RequestBody Book book){
        return bookService.alterBookShops(book);
    }

    @ResponseBody
    @RequestMapping("/delBook")
    public ResponseData<Book> delBook(@RequestParam("bookId") int bookId) {
        return bookService.delBook(bookId);
    }

}
