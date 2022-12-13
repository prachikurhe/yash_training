package com.security.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.security.app.entities.User;
import com.security.app.repository.UserRepository;

@SpringBootApplication
public class SpringBootSecurityApplication {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
		System.out.println("SpringBootSecurityApplication started.......");

//		User adminUser = new User("prachi", "password", "ADMIN", true);

//		User user = new User("xyz", "xyz", "USER", false);

	}

}
