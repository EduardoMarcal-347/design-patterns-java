package com.spring.library.services;

import com.spring.library.models.Book;
import com.spring.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> findAllBooks(){
        return repository.findAll();
    }

    public Optional<Book> findBookById(Long id){
        var book = repository.findById(id);
        if(book.isPresent()) return book;
        else {
            System.out.println("Livro não encontrado");
            return null;
        }
    }

    public Book saveBook(Book book) {
        return repository.save(book);
    }
    public Book updateBook(Book book) {
        var dbBook = repository.findById(book.getId());
        if( dbBook != null && !dbBook.isEmpty()) {
            return repository.save(book);
        }
        return null;
    }

    public void deleteBook(Long id) {
        var book = repository.findById(id);
        if( book != null && !book.isEmpty()) {
            repository.deleteById(id);
        }
    }

}
