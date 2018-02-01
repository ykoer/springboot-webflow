package de.ykoer.spring.webflow.model;

import java.io.Serializable;

public class UserInfo implements Serializable {

	private String fullName;

	private String country;

	private String city;

	private String phoneNumber;

	private User user;
	
	public UserInfo(){}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
