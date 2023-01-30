package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	private Integer book_id;
	private Integer author_id;
	private String book_name;
	private float price;
	private Integer publisher_id;
	
	public Book() {
		super();
	}
	public Book(Integer book_id, Integer author_id, String book_name, float price, Integer publisher_id) {
		super();
		this.book_id = book_id;
		this.author_id = author_id;
		this.book_name = book_name;
		this.price = price;
		this.publisher_id = publisher_id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public Integer getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(Integer publisher_id) {
		this.publisher_id = publisher_id;
	}
}
