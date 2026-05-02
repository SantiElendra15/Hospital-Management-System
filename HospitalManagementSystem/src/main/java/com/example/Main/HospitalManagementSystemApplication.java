package com.example.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalManagementSystemApplication {

	
	/*
	 		MySQL:
		create database hms
		use hms
		show tables
		select * from doctor
		select * from patients
		
	*/
	
	/*
	 	POSTMAN:
	 	   "pName":"Suresh",
		   "pAge":22,
		   "pAddress":"Hyderabad,Telangana"
	 */
	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementSystemApplication.class, args);
	}

}
