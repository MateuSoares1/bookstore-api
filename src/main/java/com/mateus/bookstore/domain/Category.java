package com.mateus.bookstore.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private List<Book> books =  new ArrayList<>();

    public Category(Integer id, String name, String description, List<Book> books) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.books = books;
    }
}
