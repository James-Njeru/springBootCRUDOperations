package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Publisher;
import com.example.crud.repository.PublisherRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PublisherService {
	@Autowired
	private PublisherRepository publisherRepository;
	
	public List<Publisher> listAll() {
        return publisherRepository.findAll();
    }
     
    public void save(Publisher publisher) {
    	publisherRepository.save(publisher);
    }
     
    public Publisher get(Integer id) {
        return publisherRepository.findById(id).get();
    }
     
    public void update(Publisher publisher)
    {
    	publisherRepository.save(publisher);
    }
    
    public void delete(Integer id) {
    	publisherRepository.deleteById(id);
    }
}
