package com.schoolManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolManagement.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

	
//	public List<Student> reverseSortByFirstName();   // trying to create custom method
	
}
