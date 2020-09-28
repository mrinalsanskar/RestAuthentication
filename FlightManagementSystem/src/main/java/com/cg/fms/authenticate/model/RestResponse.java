package com.cg.fms.authenticate.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/*
 * This class will define the responses displayed when we run into exceptions.
 * 
 * author sanskar.
 * 
 * Jackson is a very popular and efficient java based library to 
 * serialize or map java objects to JSON and vice versa. 
 * The Spring Boot parent POM includes Jackson dependencies.
 * you can ignore the fields with null value using @JsonInclude annotation in Jackson.
 * 
 */
@JsonInclude(Include.NON_NULL)
public class RestResponse<T> {

	private boolean status;
	private String message;
	
	/*
	 * <> is referring to a generic class & T is just a name like a variable name.
	 * T can be boolean type as status & String type as message(generics are data-type independent)
	 * Generics add stability to your code by making more of your bugs detectable at compile time.
	 */
	private T data;

	public RestResponse() {
		super();
	}

	public RestResponse(boolean status, String message, T data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public RestResponse(boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}	
}

