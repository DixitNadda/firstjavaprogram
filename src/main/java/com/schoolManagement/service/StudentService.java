package com.schoolManagement.service;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.schoolManagement.entity.Student;
import com.schoolManagement.repository.StudentRepository;

@Controller
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	// ADDING STUDENT
	public Student addStudent(Student student) { 	
		return studentRepository.save(student);
	}
	
	public List<Student> addStudents(List<Student> students) {
		System.out.println(students); 
		return studentRepository.saveAll(students);
	}
	
	// GET STUDENTS
	public Student getStudentsByRollNo(int rollNo){
		return studentRepository.findById(rollNo).orElse(null);
	}
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	// UPDATE STUDENT
	public Student updateStudent(Student student) {
		
		Student existingrollNo = studentRepository.findById(student.getRollno()).orElse(null);
		existingrollNo.setFirstName(student.getFirstName());
		existingrollNo.setLastName(student.getLastName());
		existingrollNo.setDob(student.getDob());
		existingrollNo.setFathersName(student.getFathersName());
		existingrollNo.setAddress(student.getAddress());
		existingrollNo.setPwd(student.getPwd());
		
		return studentRepository.save(existingrollNo);
	}
	
	//	DELETE STUDENT
	public String deleteStudent(int rollNo){
		 studentRepository.deleteById(rollNo);
		 return "student record removed! of rollnNo: "+rollNo;
	}
}


