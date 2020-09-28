package com.cg.fms.authenticate.service;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.authenticate.dao.LoginDao;
import com.cg.fms.authenticate.entity.UserEntity;
import com.cg.fms.authenticate.exceptions.CustomException;
import com.cg.fms.authenticate.model.UserModel;

/*
 * The class that implements the Interface with @Service annotation is ServiceImpl class.
 * 
 * author sanskar.
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	/*
	 * A Logger object is used to log messages for a specific system or application component.
	 * LoggerFactory is a utility class producing Loggers for various logging APIs
	 * Simple Logging Facade for Java (SLF4J) provides a Java logging API by means of a simple facade pattern.
	 * sl4j offers a generic API making the logging independent of the actual implementation.
	 * The default Spring Boot Log format gives-Date and Time that gives the date and time of the log,   Log level shows INFO, ERROR or WARN,
	 * Process ID,   The --- which is a separator,   Thread name is enclosed within the square brackets [],
	 * Logger Name that shows the Source class name,   The Log message
	 * 
	 */

	Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	LoginDao loginDao;
	
	
	 public UserEntity convert(UserModel source) {
			UserEntity eUser = null;
			if(source!=null) {
				eUser = new UserEntity();
				eUser.setUserId(source.getUserId());
				eUser.setFullName(source.getFullName());
				eUser.setGender(source.getGender());
				eUser.setUsername(source.getUsername());
				eUser.setPassword(source.getPassword());
				eUser.setRole(source.getRole());
			}
	    	return eUser;
	    	
	    }
	    
	    public UserModel convert(UserEntity source) {
			UserModel eUser = null;
			if(source!=null) {
				eUser = new UserModel();
				eUser.setUserId(source.getUserId());
				eUser.setFullName(source.getFullName());
				eUser.setGender(source.getGender());
				eUser.setUsername(source.getUsername());
				eUser.setPassword(source.getPassword());
				eUser.setRole(source.getRole());
			}
	    	return eUser;
	    	
	    }

	@Override
	public UserModel AuthenticateUser(Long userId, String password) {
		UserModel user=convert(loginDao.validateUser(userId,password));
		if(user!=null)
			return user;
		else
			throw new CustomException("Credentials Invalid");
			
	}

	@Override
	public UserModel addCredentials(UserModel credentials) {
		if((loginDao.findByUserId(credentials.getUserId()))!=convert(credentials)) {
			return convert(loginDao.save(convert(credentials)));
		}
		else
			throw new CustomException("THIS ID IS ALREADY REGISTERED, TRY WITH A NEW ONE!");
	}

}
