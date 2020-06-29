package com.studentmanagement.model;

import java.time.LocalDate;

import com.studentmanagement.model.Course;
import com.studentmanagement.model.Student;

public class Enroll {
	private Student student;
	private Course course;
	private LocalDate enrollmentDate;
	public Enroll(Student student, Course course, LocalDate enrollmentDate) {
		super();
		this.student = student;
		this.course = course;
		this.enrollmentDate = enrollmentDate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	@Override
	public String toString() {
		return "Enroll [student=" + student + ", course=" + course + ", enrollmentDate=" + enrollmentDate + "]";
	}
	
	
	
}
