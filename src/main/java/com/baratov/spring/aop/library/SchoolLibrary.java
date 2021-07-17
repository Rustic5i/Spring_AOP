package com.baratov.spring.aop.library;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {


    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }

}
