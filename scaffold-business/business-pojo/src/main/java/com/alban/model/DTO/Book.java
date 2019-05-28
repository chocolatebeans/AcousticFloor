package com.alban.model.DTO;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author Alban
 * @Date 2019-05-28
 * @Email: mrfj@live.cn
 * @Description: book
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private String uuid;

    private String bookNumber;

    private String bookName;

    private BigDecimal price;

    private Integer stockNumber;

    public Book() {
    }

    public Book(String uuid, String bookNumber, String bookName, BigDecimal price, Integer stockNumber) {
        this.uuid = uuid;
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.price = price;
        this.stockNumber = stockNumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "uuid='" + uuid + '\'' +
                ", bookNumber='" + bookNumber + '\'' +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", stockNumber=" + stockNumber +
                '}';
    }
}
