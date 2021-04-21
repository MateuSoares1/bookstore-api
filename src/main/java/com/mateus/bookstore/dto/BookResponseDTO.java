package com.mateus.bookstore.dto;

import com.mateus.bookstore.domain.Book;
import com.mateus.bookstore.domain.Category;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class BookResponseDTO {

    private Integer id;
    private String title;
    private String nameAuthor;
    private String content;

    private Category category;


    public  static BookResponseDTO  transformDTO(Book book){
        return new BookResponseDTO(book.getId(), book.getTitle(), book.getNameAuthor(), book.getContent(), book.getCategory());
    }
}
