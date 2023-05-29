package com.spring.library.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Table(name = "user_table")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", length = 100, nullable = false)
    private String name;
    @Column(name = "user_email", length = 75, nullable = false)
    private String email;
    @Column(name = "user_phone", length = 25, nullable = false)
    private String phone;

    public User() {
    }

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    
}
