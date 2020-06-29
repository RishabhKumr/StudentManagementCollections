package com.studentmanagement.model;

public interface UserInterface {
	public void showFirstScreen();
	public void showStudentScreen();
	public void showAdminScreen();
	public void showAllStudentsScreen();
	public void showStudentRegistrationScreen();
	public void introduceNewCoursesScreen();
	public void showAllCoursesScreen();
    void enrollForCourse();
    void showAllEnrollments();
}
