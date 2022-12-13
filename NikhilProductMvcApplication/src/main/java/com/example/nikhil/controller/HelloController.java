package com.example.nikhil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
    
	
	@RequestMapping(method=RequestMethod.GET , value="/get")
	public String getHello() {
		return "hello";
	}
	
}
