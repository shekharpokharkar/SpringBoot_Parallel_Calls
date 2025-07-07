package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentSevice {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student saveStudent(Student student) {

		return repository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {

		return repository.findAll();
	}

	@Override
	public Student updateStudent(Integer studentId, Student student) {
		Student student2 = repository.findById(studentId)
				.orElseThrow(() -> new RuntimeException("Student Not found Exception"));
		student.setStudentId(studentId);

		return repository.save(student);
	}

	@Override
	public Student getStudentById(Integer studentId) {

		return repository.findById(studentId).orElseThrow(() -> new RuntimeException("Student Not found Exception"));
	}

	@Override
	public String deleteStudentById(Integer studentId) {
		Student student2 = repository.findById(studentId)
				.orElseThrow(() -> new RuntimeException("Student Not found Exception"));

		repository.delete(student2);

		return "Student Deleted Successfully";
	}

}
