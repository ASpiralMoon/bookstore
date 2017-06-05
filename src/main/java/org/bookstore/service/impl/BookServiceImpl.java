package org.bookstore.service.impl;

import org.bookstore.dao.BookDao;
import org.bookstore.dao.BooksDao;
import org.bookstore.dto.Book;
import org.bookstore.dto.Books;
import org.bookstore.dto.ResponseData;
import org.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 16:58
 * @modify ...
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private BooksDao booksDao;

    /**
     * 查询上架图书列表
     *
     * @param book Book dto
     * @return
     */
    @Override
    public ResponseData<Book> queryBookList(Book book) {
        return new ResponseData<Book>(true, bookDao.queryBookList(book));
    }

    /**
     * 新增上架图书(商户)
     *
     * @param book Book dto
     * @return
     */
    @Override
    public ResponseData<Book> addBook(Book book) {
        //插入书籍表
        Books books = new Books();
        books.setBooksName(book.getBookName());
        books.setAuthor(book.getAuthor());
        booksDao.addBooks(books);
        //从书籍表中查询books_id
        List<Books> booksList = booksDao.queryBooks(books);
        book.setBooksId(booksList.get(0).getBooksId());
        //查询上架图书表
        List<Book> bookList = bookDao.queryBookList(book);
        if (!bookList.isEmpty()) {
            return new ResponseData<Book>(false, "已经上架相同书籍!");
        }
        int i = bookDao.addBook(book);
        if (i != 0) {
            return new ResponseData<Book>(true, "上架成功,请等待审核!");
        }
        return new ResponseData<Book>(false, "上架失败,请检查网络状况是否良好!");
    }

    /**
     * 管理员审核书籍
     *
     * @param book Book dto
     * @return
     */
    @Override
    public ResponseData<Book> alterBookAdmin(Book book) {
        int i = bookDao.alterBook(book);
        if (i != 0) {
            return new ResponseData<Book>(true, "审核成功!");
        }
        return new ResponseData<Book>(false, "审核失败!");
    }

    /**
     * 商户修改上架图书信息
     *
     * @param book Book dto
     * @return
     */
    @Override
    public ResponseData<Book> alterBookShops(Book book) {
        //查询上架图书表
        List<Book> bookList = bookDao.queryBookList(book);
        if (!bookList.isEmpty()) {
            return new ResponseData<Book>(false, "已经上架相同书籍!");
        }
        //插入书籍表
        Books books = new Books();
        books.setBooksName(book.getBookName());
        books.setAuthor(book.getAuthor());
        booksDao.addBooks(books);
        //从书籍表中查询books_id
        List<Books> booksList = booksDao.queryBooks(books);
        book.setBooksId(booksList.get(0).getBooksId());
        int i = bookDao.alterBook(book);
        if (i != 0) {
            return new ResponseData<Book>(true, "修改信息成功!");
        }
        return new ResponseData<Book>(false, "修改失败,请检查输入是否合法!");
    }

    /**
     * 删除上架图书信息(商户)
     *
     * @param bookId bookId
     * @return
     */
    @Override
    public ResponseData<Book> delBook(int bookId) {
        int i = bookDao.delBook(bookId);
        if (i != 0) {
            return new ResponseData<Book>(true, "删除上架图书成功!");
        }
        return new ResponseData<Book>(false, "删除失败,请检查网络状况是否良好!");
    }
}
