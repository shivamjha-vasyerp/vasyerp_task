package com.example.shivamFirst8.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Car_data")
public class CarData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="car_id")
	private int id;
	
	@Column(name="Brand")
	private String brand;
	
	@Column(name="Car_name")
	private String name;
	
	@Column(name="Car_type")
	private String type;
	
	@Column(name="Car_color")
	private String color;
	
	@Column(name="Car_launch_year")
	private String launch_year;
	
	@Column(name="Mileage")
	private String mileage;
	
	@Column(name="fuelCapacity")
	private String fuelCapacity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLaunch_year() {
		return launch_year;
	}

	public void setLaunch_year(String launch_year) {
		this.launch_year = launch_year;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	@Override
	public String toString() {
		return "CarData [id=" + id + ", brand=" + brand + ", name=" + name + ", type=" + type + ", color=" + color
				+ ", launch_year=" + launch_year + ", mileage=" + mileage + ", fuelCapacity=" + fuelCapacity
				+ ", getId()=" + getId() + ", getBrand()=" + getBrand() + ", getName()=" + getName() + ", getType()="
				+ getType() + ", getColor()=" + getColor() + ", getLaunch_year()=" + getLaunch_year()
				+ ", getMileage()=" + getMileage() + ", getFuelCapacity()=" + getFuelCapacity() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
