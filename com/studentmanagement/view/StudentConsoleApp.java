package com.studentmanagement.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.studentmanagement.controller.AppEngineEnhanced;
import com.studentmanagement.model.Course;
import com.studentmanagement.model.Student;
import com.studentmanagement.model.UserInterface;

public class StudentConsoleApp implements UserInterface {
    Scanner sc = new Scanner(System.in);
    AppEngineEnhanced appEngine = new AppEngineEnhanced();
	@Override
	public  void showFirstScreen() {
		// TODO Auto-generated method stub
		boolean bool = false;
		do {
		System.out.println("**Welcome to LTI SMS***");
		System.out.println("Tell us who you are?");
		System.out.println("1.Student\n2.Admin\n3.Exit");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1: 
			showStudentScreen();
			break;
		case 2:
			showAdminScreen();
		case 3:
			bool = true;
		
		}}
		while(bool == false);

	}

	@Override
	public void showStudentScreen() {
		// TODO Auto-generated method stub
		boolean bool = false;
		do {
		System.out.println("Select an option");
		System.out.println("1. Register yourself \n"
				+ "2.View All courses\n"
				+ "3.Enroll for a course\n"
				+ "4.Go to MainMenu\n"
				+ "5.Exit");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			showStudentRegistrationScreen();
			break;
		case 2:
			showAllCoursesScreen();
			break;
		case 3:
			enrollForCourse();
			break;
			
		case 4:
			showFirstScreen();
			break;
		case 5:
			bool = true;
			break;
		
		}}
		while(bool == false);
	}

	@Override
	public  void showAdminScreen() {
		// TODO Auto-generated method stub
		boolean bool = false;
		do {
        System.out.println("Select an option : ");
        System.out.println("1. View all students\n2. View all courses\n3. Introduce a new course\n4.Get all enrollments\n5.go to mainmenu\n6.Exit");
        int ch=sc.nextInt();
        switch (ch) {
        case 1:
            showAllStudentsScreen();
            break;
        case 2:
            showAllCoursesScreen();
            break;
        case 3:
            introduceNewCoursesScreen();
            break;
        case 4:
        	showAllEnrollments();
        	break;
        case 5:
        	showFirstScreen();
        	break;
        case 6:
        	bool=true;
        	break;

        }}
		while(bool == true);

	}


	@Override
	public void showStudentRegistrationScreen() {
	
		try {
		System.out.println("Enter Student ID:-");
	    int studentId = sc.nextInt();
	    System.out.println("Enter Name:-");
	    String studentName = sc.next();
	    System.out.println("Enter DateOfBirth");
	    String date = sc.next();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
	    LocalDate dateOfBirth = LocalDate.parse(date, formatter);
	    System.out.println(dateOfBirth);
	    Student student = new Student(studentId, studentName, dateOfBirth);
	    appEngine.register(student);
		}
		catch(Exception e)
		{
			System.out.println("\n "+"Exception occured : Field Left Empty || Invalid input type");
		}
	    
	}
	@Override
	public  void showAllStudentsScreen() {
		// TODO Auto-generated method stub
		Set<Student> students;
		students = appEngine.listOfStudents();
		System.out.println(students.toString());
		
	}

	@Override
	public void introduceNewCoursesScreen() {
		// TODO Auto-generated method stub
		try {
		System.out.println("Enter Course Id");
		int courseId = sc.nextInt();
		System.out.println("Enter Course Name");
		String courseName = sc.next();
		System.out.println("Enter Durarion");
		int courseDuration = sc.nextInt();
		System.out.println("Enter fee:");
		Double courseFee = sc.nextDouble();
		Course course = new Course(courseId, courseName, courseDuration, courseFee);
		Course course1 = new Course(101, "Rishabh", 4, 4000);
		appEngine.introduce(course);
		appEngine.introduce(course1);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: Field left empty || Invalid input type");
		}

	}

	@Override
	public void showAllCoursesScreen() {
		// TODO Auto-generated method stub
		Set<Course> courses;
		//Course course = new Course(1010,"urseName", 4, 400);
		//courses.add(course);
		courses = appEngine.listOfCourses();
	    System.out.println(courses.toString());

	}

	@Override
	public void enrollForCourse() {
		// TODO Auto-enerated method stub
		System.out.println("Enter Student ID:-");
	    int studentId = sc.nextInt();
	    System.out.println("Enter Name:-");
	    String studentName = sc.next();
	    System.out.println("Enter DateOfBirth");
	    String date = sc.next();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
	    LocalDate dateOfBirth = LocalDate.parse(date, formatter);
	    System.out.println(dateOfBirth);
	    Student student = new Student(studentId, studentName, dateOfBirth);
	    
		System.out.println("Enter Course Id");
		int courseId = sc.nextInt();
		System.out.println("Enter Course Name");
		String courseName = sc.next();
		System.out.println("Enter Durarion");
		int courseDuration = sc.nextInt();
		System.out.println("Enter fee:");
		Double courseFee = sc.nextDouble();
		Course course = new Course(courseId, courseName, courseDuration, courseFee);
		
		appEngine.enroll(student, course);
		
		
	}

	@Override
	public void showAllEnrollments() {
		// TODO Auto-generated method stub
		Map<Student,Course> enroll;
		enroll = appEngine.listOfEnrollments();
		System.out.println(enroll.toString());
		
	}
}
