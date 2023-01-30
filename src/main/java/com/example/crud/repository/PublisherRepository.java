package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

}
