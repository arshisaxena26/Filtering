package com.app.static_filtering.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

	private String name;
	private int age;

	// Static Filtering - Password and Phone Number Will never be shown in Responses
	@JsonIgnore
	private String password;
	@JsonIgnore
	private String phone;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String password, String phone, int age) {
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
