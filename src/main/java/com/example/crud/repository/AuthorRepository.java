package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
