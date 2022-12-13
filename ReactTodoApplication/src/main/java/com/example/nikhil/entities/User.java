package com.example.nikhil.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    
    private String email;
    private int age;
    private String mobile;
    private String password;
    
    
    
    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JsonManagedReference
    List<ToDo> todos=new ArrayList<ToDo>();
    
    
    User(){}
    
    
    

	public User(int id, String name, String email, int age, String mobile , String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobile = mobile;
		this.password=password;
	}
	
	




	public User(int id, String name, String email, int age, String mobile, String password, List<ToDo> todos) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobile = mobile;
		this.password = password;
		this.todos = todos;
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

	



	public List<ToDo> getTodos() {
		return todos;
	}




	public void setTodos(List<ToDo> todos) {
		this.todos = todos;
	}
	
	









	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", mobile=" + mobile + "]";
	}
	
	
	
	
    
    
}
