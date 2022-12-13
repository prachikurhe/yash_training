package com.example.nikhil.service;

import java.util.List;

import com.example.nikhil.exception.ResourceNotFoundException;
import com.example.nikhil.payloads.UserDto;

public interface UserService {
	UserDto createUser(UserDto userDto);
	
	UserDto getUserById(int userId) throws ResourceNotFoundException;
	
	List<UserDto> getAllUsers(int pageNo, int pageSize);
	
	UserDto updateUser(UserDto userDto , int userId);
	
	void deleteById(int userId);

}
