package com.security.app.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.app.entities.MyUserDetails;
import com.security.app.entities.User;
import com.security.app.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findUserByUserName(username);
		user.orElseThrow(() -> new UsernameNotFoundException("username does not exists"));
		return new MyUserDetails(user.get());
	}

}
