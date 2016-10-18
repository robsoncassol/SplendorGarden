package com.cassol.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Unit {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Long code;
	
	private String name;
	
	@OneToMany
	private List<User> residents;
	

	public Unit(String name) {
		super();
		this.name = name;
	}

	public Unit(Long code) {
		super();
		this.code = code;
	}

	public Long getId() {
		return id;
	}
	
	public Long getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	

}
