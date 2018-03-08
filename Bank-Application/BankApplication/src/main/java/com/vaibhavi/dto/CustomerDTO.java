package com.vaibhavi.dto;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class CustomerDTO {
	
	private String firstName;
	private String lastName;
	private String zipCode;
	private String ssn;
	private String email;

	public Contact(String firstName, String lastName, String zipCode,	String ssn, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
		this.ssn = ssn;
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getEmail() {
		return ssn;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
