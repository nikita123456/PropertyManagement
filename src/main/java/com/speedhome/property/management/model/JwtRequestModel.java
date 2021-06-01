package com.speedhome.property.management.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class JwtRequestModel implements Serializable {

	private String username;
	private String password;
	
	public JwtRequestModel() {
		
	}

	public JwtRequestModel(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}