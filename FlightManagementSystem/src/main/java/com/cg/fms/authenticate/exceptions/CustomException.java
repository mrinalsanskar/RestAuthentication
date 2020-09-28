package com.cg.fms.authenticate.exceptions;

/*
 * Class that handles exceptions.
 * 
 * 
 * author sanskar.
 */

public class CustomException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}
	public CustomException(String message) {
		super(message);
	}
	public CustomException(Throwable cause) {
		super(cause);
	}

}