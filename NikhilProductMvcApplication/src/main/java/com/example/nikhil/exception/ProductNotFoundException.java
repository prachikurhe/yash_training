package com.example.nikhil.exception;

public class ProductNotFoundException extends RuntimeException {
    private String message;

	public ProductNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	public ProductNotFoundException() {
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
    
    
} 
