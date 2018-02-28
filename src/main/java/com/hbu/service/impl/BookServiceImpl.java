package com.hbu.service.impl;

import com.hbu.dao.BookDao;
import com.hbu.entity.Book;
import com.hbu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chenwei on 2017/11/25.
 */
@ResponseBody
public class BookServiceImpl implements BookService {

    //注入Service依赖
    @Autowired
    BookDao bookDao;

    public int insert(Book book) {
        return bookDao.insertBook(book);
    }

    public int delete(long bookNum) {
        return bookDao.deleteBook(bookNum);
    }

    public List<Book> queryAll() {
        return bookDao.queryAllBook();
    }

    public List<Book> queryByName(String bookName) {
        return bookDao.queryByName(bookName);
    }

    public Book findOne(long bookNum) {
        return bookDao.queryByNum(bookNum);
    }

    public int updateBook(Book book) {
        return  bookDao.updateBook(book);
    }
}
