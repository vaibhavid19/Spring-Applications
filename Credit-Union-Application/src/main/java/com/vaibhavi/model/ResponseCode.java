package com.vaibhavi.model;

public class ResponseCode {
	
	private String error;
	
	public ResponseCode(String errorMessage) {
		this.error = errorMessage;
	}
	
	public String getError() {
		return error;
	}
	public void setError(String errorMessage) {
		this.error = errorMessage;
	}
	
}