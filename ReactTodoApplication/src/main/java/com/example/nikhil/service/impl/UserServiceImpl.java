package com.example.nikhil.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.nikhil.entities.User;
import com.example.nikhil.exception.ResourceNotFoundException;
import com.example.nikhil.payloads.UserDto;
import com.example.nikhil.repository.ToDoRepository;
import com.example.nikhil.repository.UserRepository;
import com.example.nikhil.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	ToDoRepository todoRepository;
	
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = this.modelMapper.map(userDto, User.class);
        User savedUser = userRepository.save(user);
        return this.modelMapper.map(savedUser, UserDto.class);
	}

	@Override
	public UserDto getUserById(int userId)  throws ResourceNotFoundException {
		Optional<User> user=userRepository.findById(userId);
		user.orElseThrow(()->new ResourceNotFoundException("User" , "ID" , userId ));
		UserDto userDto=this.modelMapper.map(user, UserDto.class);
		return userDto;
	}

	@Override
	public List<UserDto> getAllUsers(int pageNo, int pageSize) {
		org.springframework.data.domain.Pageable pageable=(org.springframework.data.domain.Pageable)PageRequest.of(pageNo, pageSize);
		Page<User>userPage=userRepository.findAll(pageable);
		List<User>users=userPage.getContent();
		
		return users.stream().map(u->this.modelMapper.map(u , UserDto.class)).collect(Collectors.toList());
	}

	@Override
	public UserDto updateUser(UserDto userDto, int userId) {
		User user = userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","id", userId));
		user.setName(userDto.getName());
		user.setAge(userDto.getAge());
		user.setMobile(userDto.getMobile());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		
		return this.modelMapper.map(userRepository.save(user) , UserDto.class);
	}

	@Override
	public void deleteById(int userId) {
		userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","id", userId));
		userRepository.deleteById(userId);
	}

	
	
	

}
