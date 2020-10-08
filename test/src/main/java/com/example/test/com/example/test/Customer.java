package com.example.test.com.example.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	private long id;
	private String name;
	private String gender;
	private String address;
	private String email;
	private String phone;
	private String priority;
	
	public Customer() {}
	
	public Customer(
			@JsonProperty("id") long id, 
			@JsonProperty("name") String name, 
			@JsonProperty("gender") String gender, 
			@JsonProperty("address") String address, 
			@JsonProperty("email") String email, 
			@JsonProperty("phone") String phone, 
			@JsonProperty("priority") String priority) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.priority = priority;
	}
	

	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void setPriority(String priority) {
		this.priority = priority;
	}


	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}


	public String getEmail() {
		return email;
	}


	public String getPhone() {
		return phone;
	}


	public String getPriority() {
		return priority;
	}


	enum Gender {
		MALE, FEMALE
	}
	
}
