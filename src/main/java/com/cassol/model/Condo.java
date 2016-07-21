package com.cassol.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Condo {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="building_id")
	private List<Building> buildings = new ArrayList<>();


	public Condo(String name) {
		super();
		this.name = name;
	}

	
	public Long getId() {
		return id;
	}
	
	public Condo addBuilding(Building building){
		this.buildings.add(building);
		return this;
	}


	public List<Building> getBuildings() {
		return Collections.unmodifiableList(this.buildings);
	}


}
