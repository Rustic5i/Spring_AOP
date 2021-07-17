package com.baratov.spring.aop.library;

import com.baratov.spring.aop.library.book.Book;
import com.baratov.spring.aop.library.book.Magazine;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UniLibrary extends AbstractLibrary {

    private List<Book> bookList = new ArrayList<>();

    {
        bookList.add(new Book("Гарри Поттер","axd",1998));
        bookList.add(new Book("Гарри Поттер 2","axd",1999));
        bookList.add(new Book("Гарри Поттер 3","axd",2002));
    }

    public void getBook() {
        System.out.println("getBook() Мы берем книгу из UniLibrary ");
        System.out.println("----------------------------------------------------------------------------------");
    }
    public List<Book> getBookList() {
        System.out.println("getBookList() начало работы метода");
        try {
            System.out.println(bookList.get(5));
        }catch (Exception ignore){

        }

        System.out.println(bookList);
        System.out.println("----------------------------------------------------------------------------------");
        return bookList;
    }
    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("----------------------------------------------------------------------------------");
    }

    public String returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Война и мир";
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("----------------------------------------------------------------------------------");
    }

    public void addBook(String personName, Book book) {

        System.out.println("addBook() Мы добавляем книгу в Библиотеку");
        System.out.println("----------------------------------------------------------------------------------");
    }

    public void addMagazine(String personName, Magazine magazine) {
        System.out.println("addMagazine() Мы добавляем журнал в Библиотеку");
        System.out.println("----------------------------------------------------------------------------------");
    }
}
