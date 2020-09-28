package com.cg.fms.authenticate.model;

/*
 * Model class for User Credentials.
 * 
 * author sanskar.
 * 
 */

public class UserModel {

	    private Long userId;
	    
	    private String username;

	    private String fullName;
	    
	    private String password;

	    private String gender;

	    private String role;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}


}
