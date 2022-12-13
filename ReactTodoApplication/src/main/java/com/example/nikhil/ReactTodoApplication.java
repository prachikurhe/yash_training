package com.example.nikhil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.nikhil.entities.ToDo;
import com.example.nikhil.entities.User;
import com.example.nikhil.repository.UserRepository;

@SpringBootApplication
public class ReactTodoApplication   implements CommandLineRunner {

	@Autowired 
	UserRepository  userRepository;  
	
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	  
	public static void main(String[] args) {
		SpringApplication.run(ReactTodoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
		
		
		
	}

}
