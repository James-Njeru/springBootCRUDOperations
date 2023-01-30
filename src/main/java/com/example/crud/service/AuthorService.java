package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Author;
import com.example.crud.repository.AuthorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthorService {
	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Author> listAll() {
        return authorRepository.findAll();
    }
     
    public void save(Author author) {
    	authorRepository.save(author);
    }
     
    public Author get(Integer id) {
        return authorRepository.findById(id).get();
    }
     
    public void update(Author author)
    {
    	authorRepository.save(author);
    }
    
    public void delete(Integer id) {
    	authorRepository.deleteById(id);
    }
}
