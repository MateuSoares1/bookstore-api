package com.mateus.bookstore.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@NoArgsConstructor
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String nameAuthor;
    private String content;

    @OneToMany(mappedBy = "category")
    private Category category;


    public Book(Integer id, String title, String nameAuthor, String content, Category category) {
        this.id = id;
        this.title = title;
        this.nameAuthor  = nameAuthor;
        this.content = content;
        this.category = category;
    }




}
