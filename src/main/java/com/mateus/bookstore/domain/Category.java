package com.mateus.bookstore.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class Category {
    private Integer id;
    private String name;
    private String description;
    private List<Book> books =  new ArrayList<>();

    public Category(Integer id, String name, String description, List<Book> books) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.books = books;
    }
}
