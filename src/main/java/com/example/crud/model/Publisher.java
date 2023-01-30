package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Publisher {
	private Integer publisher_id;
	private String publisher_name;
	private String location;
	
	public Publisher() {
		super();
	}
	public Publisher(Integer publisher_id, String publisher_name, String location) {
		super();
		this.publisher_id = publisher_id;
		this.publisher_name = publisher_name;
		this.location = location;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(Integer publisher_id) {
		this.publisher_id = publisher_id;
	}
	public String getPublisher_name() {
		return publisher_name;
	}
	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
