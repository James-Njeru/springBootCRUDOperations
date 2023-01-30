package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Book;
import com.example.crud.repository.BookRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> listAll() {
        return bookRepository.findAll();
    }
     
    public void save(Book book) {
    	bookRepository.save(book);
    }
     
    public Book get(Integer id) {
        return bookRepository.findById(id).get();
    }
     
    public void update(Book book)
    {
    	bookRepository.save(book);
    }
    
    public void delete(Integer id) {
    	bookRepository.deleteById(id);
    }
}
