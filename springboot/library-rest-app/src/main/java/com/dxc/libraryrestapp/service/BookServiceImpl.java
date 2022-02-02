package com.dxc.libraryrestapp.service;

import java.util.List;
import com.dxc.libraryrestapp.model.Book;
import com.dxc.libraryrestapp.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @Override
    public Book getBookByEmail(String Email) {
        return null;
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(int id) {
        Book book = getBookById(id);
        bookRepository.delete(book);
        
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
}
