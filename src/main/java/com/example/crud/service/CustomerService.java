package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Customer;
import com.example.crud.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> listAll() {
        return customerRepository.findAll();
    }
     
    public void save(Customer customer) {
    	customerRepository.save(customer);
    }
     
    public Customer get(Integer id) {
        return customerRepository.findById(id).get();
    }
     
    public void update(Customer customer)
    {
    	customerRepository.save(customer);
    }
    
    public void delete(Integer id) {
    	customerRepository.deleteById(id);
    }
}
