package com.security.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int userId;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "ROLE")
	private String role;
	@Column(name = "ISACTIVE")
	private boolean isActive;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public User() {
	}

	public User(String userName, String password, String role, boolean isActive) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.isActive = isActive;
	}

}
