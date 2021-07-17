package com.baratov.spring.aop.library.test;

import com.baratov.spring.aop.library.SchoolLibrary;
import com.baratov.spring.aop.library.UniLibrary;
import com.baratov.spring.aop.library.book.Book;
import com.baratov.spring.aop.library.book.Magazine;
import com.baratov.spring.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        UniLibrary uniLibrary = context.getBean(UniLibrary.class);
        Book book = context.getBean(Book.class);
        Magazine magazine = context.getBean(Magazine.class);

        uniLibrary.getBookList();
        List<Book> bookList = uniLibrary.getBookList();
        System.out.println(bookList);
     //   uniLibrary.getBook();
      //  uniLibrary.addBook("Ruslan",book);
       // uniLibrary.addMagazine("Andrey",magazine);

//        uniLibrary.getMagazine();
//        uniLibrary.returnBook();
//        uniLibrary.returnMagazine();


//        uniLibrary.returnBook();
//        SchoolLibrary schoolLibrary = context.getBean(SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
