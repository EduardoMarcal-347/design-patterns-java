package com.spring.library.models;

import jakarta.persistence.*;

@Table(name = "book_table")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_title", length = 40, nullable = false)
    private String title;

    @Column(name = "book_author", length = 75, nullable = false)
    private String author;

    @Column(name = "user")
    private User user;


}
