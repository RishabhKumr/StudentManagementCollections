package com.studentmanagement.model;

import java.time.LocalDate;

public class Student {
	private int studentId;
	private String studentName;
	private LocalDate dateOfBirth;
	/*private static int studentIdGenerator;
	static {
		studentIdGenerator = 100;
	}*/
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Student(int studentId, String studentName, LocalDate dateOfBirth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		//this.studentId = ++studentIdGenerator;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	
}
