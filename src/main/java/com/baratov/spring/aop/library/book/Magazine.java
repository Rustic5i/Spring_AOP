package com.baratov.spring.aop.library.book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Magazine {
    @Value("Детская неделя")
    private String name;
    @Value("2021")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
