package com.vaibhavi.springbootstarter;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateController {
	
	@Autowired
	private CandidateService candidateService;
	
	@RequestMapping(method=RequestMethod.POST, value="/financial-eligibility", produces="application/json; charset=UTF-8"},
					@RequestParam(value="authtoken", required=true) String authToken)
	public @ResponseBody ResponseEnity<? extends Object> createCandidate(RequestEntity<Candidate> candidateEntity)  {
		
		MultiValueMap<String, String> headers = new HttpHeaders();
        headers.put("Cache-Control",candidateEntity.getHeaders().getXRequestId());
		
		if  (!authToken.equals("secret token value")) {
			
			return new ResponseEntity<ResponseCode> ( new ResponseCode("UNAUTHENTICATED CLIENT"), headers, HTTPStatus.FORBIDDEN); 
		}
		
		Person authenticatedPersonRecord = candidateService.updateCandidate(candidateEntity.getBody());
		if (person != null) {
			return new ResponseEntity<Person> (authenticatedPersonRecord, headers, HTTPStatus.OK);
		} else {
			return new ResponseEntity<ResponseCode> ( new ResponseCode("DENIED"), headers, HTTPStatus.NON_AUTHORITATIVE_INFORMATION); 
		}
		
	}

}
