package com.schoolManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolManagement.entity.Student;
import com.schoolManagement.service.StudentService;

@RestController
public class StudentContoller {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentByRollNo/{rollNo}")
	public Student getStudentByRollNo(@PathVariable("rollNo") int rollNo) {
		return studentService.getStudentsByRollNo(rollNo);
	}	
	@GetMapping("/students")
		public List<Student> getAllStudents() {
			return studentService.getAllStudents();
	}
	@GetMapping("/reverseByRollno")
	public List<Student> revrseRollno() {
		return studentService.reverseRollno();
    }
	
	@PostMapping("/addStudents")
	public List<Student> addStudents(@RequestBody  List<Student> student){
		return studentService.addStudents(student);
	}		
	@PostMapping("/oneStudent")
	public Student addStudent(@RequestBody Student student){
		return studentService.addStudent(student);
	}
		
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return	studentService.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{rollNo}")
	public String removeStudent(@PathVariable int rollNo) {
		return studentService.deleteStudent(rollNo);
	}
}
