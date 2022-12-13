package com.example.nikhil.controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


class Mapper{
	private String data;
	public Mapper(String data) {this.data=data;}
	public String getMessage() {return this.data;}
	public void setMessage(String data) {this.data=data;}
}

@RestController
@CrossOrigin(origins ="http://localhost:3000")
public class HelloController {
     
	   @RequestMapping(method = RequestMethod.GET , value="/hello")
	   public Mapper hello() {
		   return new Mapper("krishna is the supreme personality of godhead");
	   }
	   
	   @RequestMapping(method = RequestMethod.GET , value="/getMessage")
	   public Mapper getMessage() {
		   return new Mapper("Hello Master Java Developer");
	   }
	   
	 
}
