package com.cassol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Message {
	
	private enum Type {
		COMPLAINT,
		INFO,
		SUGESTION,
		COMPLIMENT,
		AWNSERS
	}
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private User author;
	
	private String text;
	
	private Type type;
	
	@OneToMany
	private List<Message> awnsers = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public User getAuthor() {
		return author;
	}

	public String getText() {
		return text;
	}

	public Type getType() {
		return type;
	}

	public List<Message> getAwnsers() {
		return awnsers;
	}


}
