package org.bookstore.dto;

import java.math.BigDecimal;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 14:48
 * @modify ...
 */
public class Book {

    private Integer bookId;

    private String bookName;

    private String author;

    //单价
    private Double price;

    //库存
    private Integer inventory;

    private String picture;

    private Integer shopsId;

    //店铺名
    private String shopsName;

    private Byte status;

    //审批意见
    private String approvalComments;

    //审批管理员
    private Integer approvalAdmin;

    //管理员姓名
    private String adminName;

    private Integer booksId;

    //书评
    private String review;

    private Byte typeId;

    private String typeName;

    @Override
    public String toString() {
        return "book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                ", picture='" + picture + '\'' +
                ", shopsId=" + shopsId +
                ", shopsName='" + shopsName + '\'' +
                ", status=" + status +
                ", approvalComments='" + approvalComments + '\'' +
                ", approvalAdmin=" + approvalAdmin +
                ", adminName=" + adminName +
                ", booksId=" + booksId +
                ", review='" + review + '\'' +
                ", typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getShopsId() {
        return shopsId;
    }

    public void setShopsId(Integer shopsId) {
        this.shopsId = shopsId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getApprovalComments() {
        return approvalComments;
    }

    public void setApprovalComments(String approvalComments) {
        this.approvalComments = approvalComments;
    }

    public Integer getApprovalAdmin() {
        return approvalAdmin;
    }

    public void setApprovalAdmin(Integer approvalAdmin) {
        this.approvalAdmin = approvalAdmin;
    }

    public Integer getBooksId() {
        return booksId;
    }

    public void setBooksId(Integer booksId) {
        this.booksId = booksId;
    }

    public Byte getTypeId() {
        return typeId;
    }

    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getShopsName() {
        return shopsName;
    }

    public void setShopsName(String shopsName) {
        this.shopsName = shopsName;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
