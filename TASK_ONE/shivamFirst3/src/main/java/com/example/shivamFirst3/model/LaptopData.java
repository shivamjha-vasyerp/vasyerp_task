package com.example.shivamFirst3.model;


public class LaptopData {
	private String name;
	private String color;
	private String batteryMah;
	private String hasCharget;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBatteryMah() {
		return batteryMah;
	}
	public void setBatteryMah(String batteryMah) {
		this.batteryMah = batteryMah;
	}
	public String getHasCharget() {
		return hasCharget;
	}
	public void setHasCharget(String hasCharget) {
		this.hasCharget = hasCharget;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+", Color: "+color+", CharginMah: "+batteryMah+", HasCharger: "+hasCharget;
	}
}
