package com.studentmanagement.model;

public class Course implements Comparable<Course> {

	private int courseId;
	private String courseName;
	private int courseDuration;
	private double courseFee;

	public Course(int courseId, String courseName, int courseDuration, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseFee = courseFee;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseDuration;
		long temp;
		temp = Double.doubleToLongBits(courseFee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + courseId;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseDuration != other.courseDuration)
			return false;
		if (Double.doubleToLongBits(courseFee) != Double.doubleToLongBits(other.courseFee))
			return false;
		if (courseId != other.courseId)
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		return true;
	}
	@Override
	public int compareTo(Course toCourse) {
		// TODO Auto-generated method stub
		if(this.courseId == toCourse.courseId )
			return 0;
		else if(this.courseId > toCourse.courseId)
			return 1;
		return -1;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", courseFee=" + courseFee + "]";
	}

}
