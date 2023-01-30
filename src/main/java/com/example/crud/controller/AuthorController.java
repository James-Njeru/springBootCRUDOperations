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

import com.example.crud.model.Author;
import com.example.crud.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	private AuthorService authorService;
	
	    //get all authors
		@GetMapping("/authors")
		public List<Author> list() {
		    return authorService.listAll();
		}
		
		//get a specific author
		@GetMapping("/authors/{id}")
		public ResponseEntity<Author> get(@PathVariable Integer id) {
		    try {
		    	Author author = authorService.get(id);
		        return new ResponseEntity<Author>(author, HttpStatus.OK);
		    } catch (NoSuchElementException e) {
		        return new ResponseEntity<Author>(HttpStatus.NOT_FOUND);
		    }      
		}
		
		//save an author
		@PostMapping("/authors")
		public void add(@RequestBody Author author) {
			authorService.save(author);
		}
		
		//update an author
	    @PutMapping("/authors")
	    private Author update(@RequestBody Author author)
	    {
	    	authorService.update(author);
	        return author;
	    }
		
		//delete an author
		@DeleteMapping("/authors/{id}")
		public void delete(@PathVariable Integer id) {
			authorService.delete(id);
		}
}
