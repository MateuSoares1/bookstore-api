package com.mateus.bookstore.dto;

import com.mateus.bookstore.domain.Book;
import com.mateus.bookstore.domain.Category;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CategoryDTO {

    private Integer id;
    private String name;
    private String description;
    private List<Book> books =  new ArrayList<>();

    public Category transformForObject(){
        return new Category(id, name, description, books);
    }
}
