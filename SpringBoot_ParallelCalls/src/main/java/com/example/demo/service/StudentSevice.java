package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentSevice {
	
	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
	public Student updateStudent(Integer studentId,Student student);
	public Student getStudentById(Integer studentId);
	public String deleteStudentById(Integer studentId);

}
