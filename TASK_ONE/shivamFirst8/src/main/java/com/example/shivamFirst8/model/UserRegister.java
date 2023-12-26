package com.example.shivamFirst8.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="UserData",uniqueConstraints=@UniqueConstraint(columnNames="mail"))
public class UserRegister {

	@Id
	@Column(name="uid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	@Column(name="fullname")
	private String fullname;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Column(name="age")
	private String age;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="phone")
	private Long phone;
	
	@Column(name="DOB")
	private String dob;
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	

	@Override
	public String toString() {
		return "UserRegister [uid=" + uid + ", fullname=" + fullname + ", username=" + username + ", password="
				+ password + ", age=" + age + ", mail=" + mail + ", phone=" + phone + ", dob=" + dob + "]";
	}

	
	
}
