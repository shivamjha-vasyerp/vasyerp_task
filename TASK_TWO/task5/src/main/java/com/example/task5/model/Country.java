package com.example.task5.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int c_id;
	
	@Column(name="country_name")
	 String name;
	
	@Column(name="country_continent")
	 String continent;

	@OneToMany(targetEntity = Country.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cs_fk",referencedColumnName = "c_id")
	private List<State> states;
	
	public int getId() {
		return c_id;
	}

	public void setId(int id) {
		this.c_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "Country [id=" + c_id + ", name=" + name + ", continent=" + continent + ", states=" + states + "]";
	}
	
	
}
