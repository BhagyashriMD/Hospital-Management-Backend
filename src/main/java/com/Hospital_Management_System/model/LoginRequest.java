package com.Hospital_Management_System.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class LoginRequest {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	(name="id")
	long id;
	@Column
	(name="userName")
	String userName;
	@Column
	(name="password")
	String password;
	@Column
	(name="userType")
	String userType;//admin or doctor
	
	public LoginRequest()
	{
		
	}

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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LoginRequest(long id, String userName, String password, String userType) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userType=" + userType + "]";
	}

	public static Object withDefaultPasswordEncoder() {
		// TODO Auto-generated method stub
		return null;
	}
}
