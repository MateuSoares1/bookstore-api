package com.mateus.bookstore.dto;

import com.mateus.bookstore.domain.Book;
import com.mateus.bookstore.domain.Category;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CategoryResponseDTO {

    private Integer id;
    private String name;
    private String description;
    private List<Book> books =  new ArrayList<>();

    public  static CategoryResponseDTO  transformDTO(Category category){
        return new CategoryResponseDTO(category.getId(), category.getName(), category.getDescription(), category.getBooks());
    }
}
