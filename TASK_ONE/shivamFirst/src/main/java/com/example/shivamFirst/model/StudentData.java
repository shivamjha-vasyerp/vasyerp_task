package com.example.shivamFirst.model;

public class StudentData {
 private int id;
 private String name;
 private int marks;
 private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [id=" + id + ", name="+name+", marks: "+marks+", age: "+age+"]";
	}
}
