package org.bookstore.dto;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 16:15
 * @modify ...
 */
public class Books {

    private int booksId;

    private String booksName;

    private String author;

    @Override
    public String toString() {
        return "Books{" +
                "booksId=" + booksId +
                ", booksName='" + booksName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public int getBooksId() {
        return booksId;
    }

    public void setBooksId(int booksId) {
        this.booksId = booksId;
    }

    public String getBooksName() {
        return booksName;
    }

    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
