package com.cassol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Building {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="building_unit_id")
	private List<Unit> units = new ArrayList<>();

	public Building(String name) {
		super();
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	
	public Building addUnit(Unit unit){
		this.units.add(unit);
		return this;
	}


	

}
