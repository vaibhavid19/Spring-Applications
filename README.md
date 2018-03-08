# Spring-Applications

-------------------------
Credit Union Application
-------------------------
(1)For first exercise of Credit Union application, the functionality leans towards to the 
implementation of HTTP GET method but since only two methods were mentioned in the problem 
(POST/PUT), I chose POST method with JSON object sent along with request. 

(2)To map person object to desired JSON representation, JsonIgnore annotation is used suppressing 
display for fields not required 
 
(3) In Credit Union Application, DTO class is referred as Candidate

(4)One caveat project holds is approx implementation of desired functionality related to http headers 
field, functionality is in place, can be replaced with exact function provided by x-request-id field 
api for RequestEntity.

Tools /Frameworks: STS, Maven, Jackson API, Java Streams, Lambdas


-------------------------
Bank Application
-------------------------
(1)Used Builder design pattern to create customer with id field constructed from fields of DTO Object
passed

(2)Consumed Eligibility API using RestTemplate postForObject API
Tools /Frameworks: STS, Spring Initializr, Spring CLI, groovy
