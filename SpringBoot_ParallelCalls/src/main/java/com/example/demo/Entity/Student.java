package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_Id")
	private Integer studentId;
	@Column(name = "Student_Name")
	private String studentname;
	@Column(name = "Student_City")
	private String studentCity;
	@Column(name = "Student_Is_Married")
	private boolean isMarried;
	@Column(name = "Student_Percentage")
	private Long studentPercentage;
	
	
}
