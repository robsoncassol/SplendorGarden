package com.cassol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Awnser {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String message;

	private Integer rating;

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Integer getRating() {
		return rating;
	}
	
	
	
	
}
