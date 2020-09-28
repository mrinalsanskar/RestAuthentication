package com.cg.fms.authenticate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * We use the @SpringBootApplication annotation in our Application or Main class to enable a host of features, 
 * e.g. Java-based Spring configuration, component scanning, and in particular for enabling Spring Boot's auto-configuration feature
 * 
 * author sanskar.
 */
@SpringBootApplication
public class FlightManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightManagementSystemApplication.class, args);
	}

}
