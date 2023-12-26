package com.example.task2.dto;

public class TeacherDto {
	private long id;
	private String name;
	private String subject;
	private long contact;
	private String class_teacher;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getClass_teacher() {
		return class_teacher;
	}
	public void setClass_teacher(String class_teacher) {
		this.class_teacher = class_teacher;
	}
	@Override
	public String toString() {
		return "TeacherDto [id=" + id + ", name=" + name + ", subject=" + subject + ", contact=" + contact
				+ ", class_teacher=" + class_teacher + "]";
	}
	
	
}
