package com.cassol.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;
	

	@ElementCollection
	private List<Profile> profiles = new ArrayList<>();
	
	
	enum Profile{
		SYNDIC,
		DWELLER,
		SUPERVISOR,
		FINANCIAL_MANAGER,
	}


	public User(String name, Profile ...profiles ) {
		super();
		this.name = name;
		this.profiles.addAll(Arrays.asList(profiles));
	}


	public Long getId() {
		return id;
	}
	
	
	

}
