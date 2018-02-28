package com.hbu.service;

import com.hbu.entity.Book;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */
public interface BookService {
    int insert(Book book);

    int delete(long bookNum);

    List<Book> queryAll();

    List<Book> queryByName(String bookName);

    Book findOne(long bookNum);

    int updateBook(Book book);
}
