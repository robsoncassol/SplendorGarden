package com.cassol.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	@ElementCollection
	private List<Profile> profiles = new ArrayList<>();

	@ManyToOne
	private Unit unit;
	
	private boolean owner = false;
	
	enum Profile{
		SYNDIC,
		DWELLER,
		SUPERVISOR,
		FINANCIAL_MANAGER,
	}

	private User(){
	}
	

	public User(String name, Profile ...profiles ) {
		this();
		this.name = name;
		this.profiles.addAll(Arrays.asList(profiles));
	}


	public Long getId() {
		return id;
	}

	public List<Profile> getProfiles() {
		return profiles;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}
	
	public Unit getUnit() {
		return unit;
	}
	
	public boolean isOwner() {
		return owner;
	}
	

}
