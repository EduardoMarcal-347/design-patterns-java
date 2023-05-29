package com.spring.library.controllers;

import com.spring.library.models.Book;
import com.spring.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("books")
    public List<Book> findAllBooks(){
        return service.findAllBooks();
    }

    @GetMapping("book/{id}")
    public Optional<Book> findById(@PathVariable("id") Long id){
        return service.findBookById(id);
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return service.saveBook(book);
    }
    @PutMapping("book")
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }
    @DeleteMapping("book/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        try {
            service.deleteBook(id);
            return "book with ID " + id + " has been deleted!";
        }catch(Exception e)
        {
            return e.getMessage();
        }
    }

}
