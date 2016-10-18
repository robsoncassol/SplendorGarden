package com.cassol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Complaint {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private User complainer;
	
	private String message;
	
	@OneToMany
	private List<Awnser> awnsers = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public User getComplainer() {
		return complainer;
	}

	public String getMessage() {
		return message;
	}

	public void addAwnser(Awnser answer){
		this.awnsers.add(answer);
	}

	
	

}
