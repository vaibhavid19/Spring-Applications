package com.vaibhavi.model;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Person {
	
	private String firstName;
	private String lastName;
	private String zipCode;
	private String ssn;
	boolean Eligibility;

	public Candidate(String firstName, String lastName, String zipCode,	String ssn, boolean Eligibility) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
		this.ssn = ssn;
		this.Eligibility = Eligibility;
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
	
	@JsonIgnore
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@JsonIgnore
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getEligibility() {
		return Eligibility;
	}
	public void setEligibility(boolean Eligibility) {
		this.Eligibility = Eligibility;
	}

}
