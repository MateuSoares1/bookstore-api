package com.mateus.bookstore.dto;

import com.mateus.bookstore.domain.Book;
import com.mateus.bookstore.domain.Category;
import lombok.Getter;

@Getter
public class BookDTO {
    private Integer id;
    private String title;
    private String nameAuthor;
    private String content;

    private Category category;

    public Book transformForObject(){
        return new Book(id, title, nameAuthor, content, category);
    }
}
