package com.book.service;

import com.book.dao.BookDao;
//import com.sun.xml.internal.bind.v2.TODO;
import com.book.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Author: VaporYan
 * @Decription: BookService
 * @Date: Created in 9:53 2018/5/9
 * @Modified By:
 */
@Service
public class BookService {

    private BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public boolean matchBook(String searhWord) {
        return bookDao.matchBook(searhWord) > 0;
    }

    public ArrayList<Book> queryBook(String sw) {
        return bookDao.queryBook(sw);
    }

    public ArrayList<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public int deleteBook(int bookId) {
        return bookDao.deleteBook(bookId);
    }

    public boolean addBook(Book book) {
        return bookDao.addBook(book) > 0;
    }

    public Book getBook(Long bookId) {
        Book book=bookDao.getBook(bookId);
        return book;
    }

    public boolean editBook(Book book) {
        return bookDao.editBook(book) > 0;
    }

}
