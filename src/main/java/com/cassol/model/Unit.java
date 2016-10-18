package com.cassol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Unit {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private Long code;
	
	@Column
	private String name;
	
	@OneToOne
	private User owner;

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
	
	
	

}
