package com.baratov.spring.aop.library.test;

import com.baratov.spring.aop.library.UniLibrary;
import com.baratov.spring.aop.library.book.Book;
import com.baratov.spring.aop.library.book.Magazine;
import com.baratov.spring.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Method Main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        UniLibrary uniLibrary = context.getBean(UniLibrary.class);
        String nameBook = uniLibrary.returnBook();
        System.out.println("name Book "+nameBook);


        context.close();
        System.out.println("Method Main ends");
    }
}
