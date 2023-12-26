package com.example.task3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String location;
	
	private int total_classroom;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTotal_classroom() {
		return total_classroom;
	}

	public void setTotal_classroom(int total_classroom) {
		this.total_classroom = total_classroom;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", location=" + location + ", total_classroom=" + total_classroom
				+ "]";
	}
	
	
}
