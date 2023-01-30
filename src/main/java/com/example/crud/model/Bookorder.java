package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bookorder {
	private Integer order_id;
	private String order_status;
	private Integer customer_id;
	private Integer book_id;
	
	public Bookorder() {
		super();
	}

	public Bookorder(Integer order_id, String order_status, Integer customer_id, Integer book_id) {
		super();
		this.order_id = order_id;
		this.order_status = order_status;
		this.customer_id = customer_id;
		this.book_id = book_id;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Integer getBook_id() {
		return book_id;
	}

	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	
}
