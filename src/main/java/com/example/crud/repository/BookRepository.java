package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
