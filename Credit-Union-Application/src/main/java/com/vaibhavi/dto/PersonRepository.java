package com.vaibhavi.dto;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class PersonRepository {
	
	private static List<Person> recordList = null;
	
	public PersonRepository() {
		
		this.recordList.add(new Person("Billy", "Bob", "84102", "1234-156", false);
		this.recordList.add(new Person("Jane", "Doe", "7601", "5234-387", false);
		this.recordList.add(new Person("Vir", "Das", "07601", "8434-187", true);
		this.recordList.add(new Person("ben", "T", "10016", "0714-555", true);
		
	}
	
	public static List<Person> getRepository() {
		return recordList;
		
	}
	
	public static Person getPersonBySsn(String ssn) {
		for (Person p: recordList) {
			if ((p.getSsn()).equals(ssn)) {
				return p;
		}
		return null;
		
	}


}
