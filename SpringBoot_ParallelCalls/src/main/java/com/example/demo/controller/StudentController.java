package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.service.StudentSevice;
import com.example.demo.service.StudentTest;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentSevice service;

	@Autowired
	private StudentTest studentTest;

	@PostMapping("/")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		long timeMillis = System.currentTimeMillis();
		System.out.println("InitialTime:" + timeMillis);
		try {
			studentTest.show1();
			studentTest.show2();
			studentTest.show3();
			studentTest.show4();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Student saveStudent = service.saveStudent(student);
		System.out.println("FinishedTime:" + (System.currentTimeMillis() - timeMillis));
		return new ResponseEntity<Student>(saveStudent, HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> students = service.getAllStudent();
		return new ResponseEntity<>(students, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer studentId) {
		Student student = service.getStudentById(studentId);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("id") Integer studentId, @RequestBody Student student) {
		Student updatedStudent = service.updateStudent(studentId, student);
		return new ResponseEntity<>(updatedStudent, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer studentId) {
		String message = service.deleteStudentById(studentId);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

}
