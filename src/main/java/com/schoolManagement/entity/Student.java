package com.schoolManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollno;
	
	private String firstName;
	
	private String lastName;
	
	private String standard;

	private String dob;

	private String fathersName;

	private String address;

	private String pwd;
	
}
