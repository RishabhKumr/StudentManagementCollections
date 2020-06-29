package com.studentmanagement.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import com.studentmanagement.model.Course;
import com.studentmanagement.model.Student;

public class AppEngineEnhanced {
	Set<Course> courses = new HashSet<>();
	Set<Student> students = new HashSet<>();
	Map<Student,Course> enroll = new HashMap<>();
	public void introduce(Course course) {
	
		courses.add(course);
		System.out.println("Course Added!");
	}
	
	public void register(Student student) {
	  
		students.add(student);
		System.out.println("Student Registered!");
	}
	
	public Set<Student> listOfStudents() {
		return students;
	}
	
	public Set<Course> listOfCourses(){
		return courses;
	}		
	
	public void enroll(Student student,Course course) {
	
		enroll.put(student, course);
		System.out.println("Enrolled!!");
	}
	
	public Map<Student,Course> listOfEnrollments(){
		return enroll;
	}
	
	
}
