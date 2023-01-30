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

import com.example.crud.model.Publisher;
import com.example.crud.service.PublisherService;

@RestController
public class PublisherController {
	@Autowired
	private PublisherService publisherService;
	
	    //get all publishers
		@GetMapping("/publishers")
		public List<Publisher> list() {
		    return publisherService.listAll();
		}
		
		//get a specific publisher
		@GetMapping("/publishers/{id}")
		public ResponseEntity<Publisher> get(@PathVariable Integer id) {
		    try {
		    	Publisher publisher = publisherService.get(id);
		        return new ResponseEntity<Publisher>(publisher, HttpStatus.OK);
		    } catch (NoSuchElementException e) {
		        return new ResponseEntity<Publisher>(HttpStatus.NOT_FOUND);
		    }      
		}
		
		//save a publisher
		@PostMapping("/publishers")
		public void add(@RequestBody Publisher publisher) {
			publisherService.save(publisher);
		}
		
		//update a publisher
	    @PutMapping("/publishers")
	    private Publisher update(@RequestBody Publisher publisher)
	    {
	    	publisherService.update(publisher);
	        return publisher;
	    }
		
		//delete a publisher
		@DeleteMapping("/publishers/{id}")
		public void delete(@PathVariable Integer id) {
			publisherService.delete(id);
		}
}
