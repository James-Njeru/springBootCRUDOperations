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

import com.example.crud.model.Customer;
import com.example.crud.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	    //get all customers
		@GetMapping("/customers")
		public List<Customer> list() {
		    return customerService.listAll();
		}
		
		//get a specific customer
		@GetMapping("/customers/{id}")
		public ResponseEntity<Customer> get(@PathVariable Integer id) {
		    try {
		    	Customer customer = customerService.get(id);
		        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		    } catch (NoSuchElementException e) {
		        return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		    }      
		}
		
		//save an customer
		@PostMapping("/customers")
		public void add(@RequestBody Customer customer) {
			customerService.save(customer);
		}
		
		//update a customer
	    @PutMapping("/customers")
	    private Customer update(@RequestBody Customer customer)
	    {
	    	customerService.update(customer);
	        return customer;
	    }
		
		//delete a customer
		@DeleteMapping("/customers/{id}")
		public void delete(@PathVariable Integer id) {
			customerService.delete(id);
		}
}
