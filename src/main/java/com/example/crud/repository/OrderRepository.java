package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Bookorder;

public interface OrderRepository extends JpaRepository<Bookorder, Integer> {

}
