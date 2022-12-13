package com.example.nikhil.payloads;

public class ApiResponse {
   private String className;
   private String id;
   
   
public ApiResponse(String className, String id) {
	super();
	this.className = className;
	this.id = id;
}
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
   
   
}
