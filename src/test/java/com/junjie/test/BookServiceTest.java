package com.junjie.test;

import com.junjie.pojo.Books;
import com.junjie.service.BookService;
import com.junjie.service.BookServiceImpl;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BookServiceTest extends TestCase {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    BookService bookService = (BookService) context.getBean("BookServiceImpl");

    public void testAddBook() {
        Books book = new Books();
        book.setBookCounts(12);
        book.setBookName("java从入门到精通");
        book.setDetail("嘿嘿嘿");
        System.out.println(bookService.addBook(book));
    }

    public void testDeleteBookById() {
    }

    public void testUpdateBook() {
    }

    public void testQueryBookById() {
        bookService.queryBookById(1);
        System.out.println();
    }

    public void testQueryAllBook() {
        for(Books books : bookService.queryAllBook()){
            System.out.println(books);
        }
    }
}