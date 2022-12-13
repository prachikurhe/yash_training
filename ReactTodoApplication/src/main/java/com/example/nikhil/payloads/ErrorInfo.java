package com.example.nikhil.payloads;

import java.time.LocalDateTime;

public class ErrorInfo {
    private String message;
    private int errorCode;
    private  LocalDateTime timestamp;
    
    public ErrorInfo() {}
	public ErrorInfo(String message, int errorCode, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.errorCode = errorCode;
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
    
    
}
