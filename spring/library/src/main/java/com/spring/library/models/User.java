package com.spring.library.models;

import jakarta.persistence.Table;

import java.io.Serializable;

@Table(name = "user_table")
public class User implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String phone;

}
