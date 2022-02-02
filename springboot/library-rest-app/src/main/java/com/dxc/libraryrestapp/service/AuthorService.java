package com.dxc.libraryrestapp.service;

import java.util.List;

import com.dxc.libraryrestapp.model.Author;

public interface AuthorService {
    public Author getAuthorById(int id);
    public Author getAuthorByEmail(String Email);
    public Author createAuthor(Author author);
    public Author updateBook(Author author);
    public void deleteAuthor(int id);
    public List<Author> getAllAuthor();
    
}
