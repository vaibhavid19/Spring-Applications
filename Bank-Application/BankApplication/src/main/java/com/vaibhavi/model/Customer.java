package com.vaibhavi.dto.candidate;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String zipCode;
	private String email;
	private String id;
	
	pulic static class Builder {
		
	
		private String firstName;
		private String lastName;
		private String zipCode;
		private String email;
		private String id;
	
		public Builder(String firstName, String lastName, String zipCode, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.zipCode = zipCode;
			this.email = email;
		}
		
		public Builder ssn(String ssn) {
			this.id = this.zipCode + ssn.substring(ssn.legth()-4);
			return this;
		}
		
		public Customer build(){			
			return new Customer(this);
		}
	
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
	
	public String getEmail() {
		return ssn;
	}
	public void setEmail(String ssn) {
		this.ssn = ssn;
	}
	
	public String getId() {
		return this.id;
	}

}
