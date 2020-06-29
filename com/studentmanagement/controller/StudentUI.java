package com.studentmanagement.controller;
import com.studentmanagement.model.*;
public class StudentUI {
	public void display(Student student)
	{
		System.out.println(student.getStudentId()+""+student.getStudentName()+""+student.getDateOfBirth());
	}
	public void displayCourse(Course course)
	{
		System.out.println(course.getCourseId()+"\t"+course.getCourseName()+"\t"+course.getCourseFee()+"\t"+course.getCourseDuration());
	}
	
	public void displayEnrollments(Enroll enroll)
	{
		Student student = enroll.getStudent();
		Course course = enroll.getCourse();
		System.out.println(""+student.getStudentId()+""+student.getStudentName()+""+course.getCourseName()+""+enroll.getEnrollmentDate());
	}
}
