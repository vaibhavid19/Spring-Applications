package com.vaibhavi.service;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	private static List<Customer> customers = new ArrayList<>();
	
	public Customer getCustomer(String id) {
		return customers.stream().filter(c-> c.getId().equals(id)).findFirst().get();
	}
	
	public Customer addCustomer(CustomerDTO customerDTO) throws Exception{
		
		if(isCustomerEligible(customerDTO)) {
			
			Customer customer = customers.add(new Customer.Builder(customerDTO.getFirstName()
												,customerDTO.getLastName()
												,customerDTO.getZipCode()
												,customerDTO.getEmail())
												.ssn(customerDTO.getSsn())
												.build());
					
			return customer;
		} else {
			return null;
		}
	}
	
	/*	
		For each request consume the service implemented in the first application to decide 
		whether the person is eligible to be created as a customer. (Using Spring RestTemplate 
		to consume rest services is preferable. Alternatively, HttpUrlConnection, Apache HTTP 
		client or any similar library can be used.
		
		https://docs.spring.io/spring/docs/3.0.x/javadoc-api/org/springframework/web/client/RestTemplate.html#getForObject(String, Class, String...)
	*/
	public boolean isCustomerEligible(CustomerDTO customerDTO){
		
		boolean isEligible=false;
		final String uri = "http://localhost:9090/financial-eligibility";
     
		RestTemplate restTemplate = new RestTemplate();
		Candidate candidate = new Candidate(customerDTO.getFirstName()
											,customerDTO.getLastName()
											,customerDTO.getZipCode()
											,customerDTO.getSsn());
		try {
			Person person = restTemplate.postForObject(uri, candidate, Candidate.class);
			//Check the field eligibility of JSON object
			if (person.getEligibility()) {		
				isEligible=true;
			}
		} catch(RuntimeException re) {
				re.printStackTrace();
		}	
		return isEligible;
	}

}
