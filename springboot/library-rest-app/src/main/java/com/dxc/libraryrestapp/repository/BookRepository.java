package com.dxc.libraryrestapp.repository;

import com.dxc.libraryrestapp.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
