package com.example.nikhil.payloads;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

import com.example.nikhil.entities.ToDo;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class UserDto {
    
	private int id;
    private String name;
    
    @Email(message = "the email is invalid")
    private String email;
    
    @Min(value = 20 , message = "employee must be minimum 2o years of age")
    private int age;
    private String mobile;
    private String password;
    private String imageName;
    
    @JsonManagedReference
    List<ToDoDto> todos=new ArrayList<ToDoDto>();
    
    public UserDto() {}
	public UserDto(int id, String name, String email, int age, String mobile , String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobile = mobile;
		this.password=password;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<ToDoDto> getTodos() {
		return todos;
	}
	public void setTodos(List<ToDoDto> todos) {
		this.todos = todos;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	
	
	
	
	
	
    
    
	
	
}
