package com.vaibhavi.springapp;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable String id) {
		return customerService.getCustomer(id);
	}
	
	@RequestMapping("/customers")
	public @ResponseBodt @ResponseEnity<? extends Object> getCustomer(@RequestBody CustomerDTO customerDTO) {
		Customer customer = customerService.addCustomer(customerDTO);
		if (customer != null) {
			return new ResponseEnity<Customer> (customer, HTTPStatus.CREATED);
		} else {
			return new ResponseEnity<ResponseCode> (new ResponseCode("DENIED"), HTTPStatus.FORBIDDEN);
		}
	}
	

}
