package com.cg.fms.authenticate.service;

import com.cg.fms.authenticate.model.UserModel;

/*
 * Service Components are the class file which contains @Service annotation. 
 * Used to write business logic in a different layer & are separated from @RestController class file. 
 * 
 * author sanskar.
 * 
 */

public interface LoginService {
	 UserModel AuthenticateUser(Long userId, String password);
	 UserModel addCredentials(UserModel credentials);
	 
}
