package com.hbu.dao;

import com.hbu.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */
public interface BookDao {

    /**
     * 添加图书
     * @param book
     * @return
     */
    int insertBook(Book book);

    /**
     * 删除图书
     * @param bookNum
     * @return
     */
    int deleteBook(@Param("bookNum") long bookNum);

    /**
     * 查询所有图书
     * @return
     */
    List<Book> queryAllBook();

     /** 通过名字查询图书
     * @param bookName
     * @return
      */
    List<Book> queryByName(@Param("bookName") String bookName);

    /**
     * 通过id查询图书
     * @param bookNum
     * @return
     */
    Book queryByNum(@Param("bookNum") long bookNum);

    /**
     * 更新图书
     * @param book
     * @return
     */
    int updateBook(Book book);
}
