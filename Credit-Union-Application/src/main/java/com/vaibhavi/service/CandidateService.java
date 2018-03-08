package com.vaibhavi.service;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
	
	private Candidate candidate;
	
	public Person checkValidity(Candidate candidate) throws Exception{
		
		Optional<Person> validRecordFromRepo = PersonRepository.getRepository().stream()
		.filter(p -> (p.getFirstName().equals(candidate.getFirstName()) 
		&& p.getLastName().equals(candidate.getLastName()) 
		&& p.getSsn().equals(candidate.getSsn())))
		.findFirst();
		
		if (validRecordFromRepo.isPresent()) {
			return validRecordFromRepo.get();
		}
		
		return null;		
	}
	
	public Person createCandidate(Candidate candidate) {
		
		return checkValidity(candidate);

	}
	
	

}
