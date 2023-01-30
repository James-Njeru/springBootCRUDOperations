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

import com.example.crud.model.Bookorder;
import com.example.crud.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	    //get all orders
		@GetMapping("/orders")
		public List<Bookorder> list() {
		    return orderService.listAll();
		}
		
		//get a specific order
		@GetMapping("/orders/{id}")
		public ResponseEntity<Bookorder> get(@PathVariable Integer id) {
		    try {
		    	Bookorder bookorder = orderService.get(id);
		        return new ResponseEntity<Bookorder>(bookorder, HttpStatus.OK);
		    } catch (NoSuchElementException e) {
		        return new ResponseEntity<Bookorder>(HttpStatus.NOT_FOUND);
		    }      
		}
		
		//save an order
		@PostMapping("/orders")
		public void add(@RequestBody Bookorder bookorder) {
			orderService.save(bookorder);
		}
		
		//update an order
	    @PutMapping("/orders")
	    private Bookorder update(@RequestBody Bookorder bookorder)
	    {
	    	orderService.update(bookorder);
	        return bookorder;
	    }
		
		//delete an order
		@DeleteMapping("/orders/{id}")
		public void delete(@PathVariable Integer id) {
			orderService.delete(id);
		}
}
