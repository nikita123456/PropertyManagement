package com.speedhome.property.management.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class JwtResponseModel implements Serializable {

	private final String jwttoken;

	public JwtResponseModel(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
