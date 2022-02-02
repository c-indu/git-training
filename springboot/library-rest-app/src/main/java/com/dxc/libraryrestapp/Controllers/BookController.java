package com.dxc.libraryrestapp.Controllers;

import java.time.LocalDate;
import java.util.List;


import com.dxc.libraryrestapp.model.Book;
import com.dxc.libraryrestapp.service.BookService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private ModelMapper modelMapper;
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        book.setPublicationDate(LocalDate.now());
        return bookService.createBook(book);
    }
    @GetMapping("/bookss/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }
    @PutMapping("bookss/{id}")
    public Book updateBook(@PathVariable Book book){
        return bookService.updateBook(book);
    }
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable int id){
         bookService.deleteBook(id);
    }
}