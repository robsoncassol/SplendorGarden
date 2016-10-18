package com.cassol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Awnser {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String message;

	@ManyToOne
	private User user;
	

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	
	
	
	
}
