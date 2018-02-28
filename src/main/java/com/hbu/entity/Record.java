package com.hbu.entity;

import java.util.Date;

/**
 * Created by chenwei on 2017/11/24.
 */

//图书借阅
public class Record {

    private Long recordId;

    private Long bookNum;

    private Book book;

    private Card card;

    private String name;

    private Date bringDate;

    private Date backDate;

    private State State;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getBookNum() {
        return bookNum;
    }

    public void setBookNum(Long bookNum) {
        this.bookNum = bookNum;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBringDate() {
        return bringDate;
    }

    public void setBringDate(Date bringDate) {
        this.bringDate = bringDate;
    }

    public Date getBackDate() {
        return backDate;
    }

    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }

    public State getState() {
        return State;
    }

    public void setState(State state) {
        State = state;
    }


    @Override
    public String toString() {
        return "Record{" + "recordId=" + recordId + ", bookNum=" + bookNum + ", book=" + book + ", card=" + card + ", name='" + name + '\'' + ", bringDate=" + bringDate + ", backDate=" + backDate + ", State=" + State + '}';
    }
}
