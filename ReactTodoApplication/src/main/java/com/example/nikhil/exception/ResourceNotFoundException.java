package com.example.nikhil.exception;

public class ResourceNotFoundException  extends RuntimeException {
    private String message;
    
    
	public ResourceNotFoundException() {
		super();
	}
	
	
	public ResourceNotFoundException(String cname, String fname, int value) {
		super();
	    this.message=String.format("exception occured in class %s field %s and value %d",cname , fname , value);	
	}


	public ResourceNotFoundException(String message) {
		super();
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	


	
    
    
}
