package com.cg.fms.authenticate.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.fms.authenticate.model.LoginModel;
import com.cg.fms.authenticate.model.UserModel;
import com.cg.fms.authenticate.service.LoginService;

/*
 * @RestController annotation was introduced in Spring 4.0 to simplify the creation of RESTful web services. 
 * Convenience annotation that combines @Controller and @ResponseBody
 * Eliminates the need to annotate every request handling method of the controller class with the @ResponseBody annotation
 * Takes care of mapping request data to the defined request handler method. 
 * Once response body is generated from the handler method, it converts it to JSON or XML response.
 * 
 * author sanskar.
 * 
 */
@RestController
public class LoginController {

	/*
	 * @Autowired allows Spring to resolve and inject collaborating beans into our bean.
	 * After enabling annotation injection, we can use autowiring on properties, setters, and constructors.
	 * Dependency Injection is passing dependency to other objects or framework & it makes unit testing easier.
	 */
	@Autowired
	LoginService loginService;
	
	
	
	/*
	 * @GetMapping annotation maps HTTP GET requests onto specific handler methods. 
	 * It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
	 * Here, we are going to verify credentials, allow user login accordingly by userId & password and return complete credentials. 
	 */
	@GetMapping(value="/login")
	public ResponseEntity<UserModel> login(@RequestBody LoginModel credentials){
		 UserModel user = loginService.AuthenticateUser(credentials.getUserId(), credentials.getPassword());
	        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
	}
	
	/*
	 * @PostMapping maps HTTP POST requests onto specific handler methods.
	 * It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST).
	 * Here, we are submitting all our credentials to register as a new user into the system. 
	 */
	@PostMapping(value="/addCredentials")
	public ResponseEntity<UserModel> newCredentials(@RequestBody UserModel credentials){
		UserModel cred=loginService.addCredentials(credentials);
		return new ResponseEntity<>(cred, HttpStatus.ACCEPTED);
	}
	

}
