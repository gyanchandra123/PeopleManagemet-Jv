package com.in28minutes.jpa.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Review {

	@Id
	@GeneratedValue
	private Long id;

 
	private String description; 
	
	private String rating;
	 
	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Review() {

	}

	public Review(String description,String rating) {
		super();
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Review [description=" + description + ", rating=" + rating + "]";
	}

	 

}
