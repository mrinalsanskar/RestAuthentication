package com.cg.fms.authenticate.model;

/*
 * Model class for Login Request
 * 
 * author sanskar.
 * 
 */

public class LoginModel {
	
	private Long userId;
	private String password;
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
