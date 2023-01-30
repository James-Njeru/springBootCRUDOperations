package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Bookorder;
import com.example.crud.repository.OrderRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Bookorder> listAll() {
        return orderRepository.findAll();
    }
     
    public void save(Bookorder bookorder) {
    	orderRepository.save(bookorder);
    }
     
    public Bookorder get(Integer id) {
        return orderRepository.findById(id).get();
    }
    
    public void update(Bookorder bookorder)
    {
    	orderRepository.save(bookorder);
    }
     
    public void delete(Integer id) {
    	orderRepository.deleteById(id);
    }
}
