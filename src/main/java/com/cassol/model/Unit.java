package com.cassol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Unit {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;

	public Unit(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	
	
	

}
