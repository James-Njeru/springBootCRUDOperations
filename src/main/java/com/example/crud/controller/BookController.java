package com.example.crud.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Book;
import com.example.crud.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	//get all books
	@GetMapping("/books")
	public List<Book> list() {
	    return bookService.listAll();
	}
	
	//get a specific book
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> get(@PathVariable Integer id) {
	    try {
	    	Book book = bookService.get(id);
	        return new ResponseEntity<Book>(book, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	//save a book
	@PostMapping("/books")
	public void add(@RequestBody Book book) {
		bookService.save(book);
	}
	
	//update a book
    @PutMapping("/books")
    private Book update(@RequestBody Book book)
    {
    	bookService.update(book);
        return book;
    }
	
	//delete a book
	@DeleteMapping("/books/{id}")
	public void delete(@PathVariable Integer id) {
	    bookService.delete(id);
	}
}
