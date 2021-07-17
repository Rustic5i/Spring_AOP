package com.baratov.spring.aop.library.book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class Book {
    @Value("Преступление и накозание")
    private String name;
    @Value("Ф.М Достоевский ")
    private String author;
    @Value("1866")
    private int yearOfPublication;

    public Book() {
    }

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Название книги ='" + name + '\'' +
                ", Автор книги ='" + author + '\'' +
                ", Год публикации=" + yearOfPublication+" год";
    }
}
