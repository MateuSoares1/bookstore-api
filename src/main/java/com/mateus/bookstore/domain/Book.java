package com.mateus.bookstore.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Getter
@NoArgsConstructor
public class Book {

    private Integer id;
    private String title;
    private String nameAuthor;
    private String content;

    private Category category;


    public Book(Integer id, String title, String nameAuthor, String content, Category category) {
        this.id = id;
        this.title = title;
        this.nameAuthor  = nameAuthor;
        this.content = content;
        this.category = category;
    }




}
