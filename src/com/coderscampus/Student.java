package com.coderscampus;

public class Student {
	private String studentId;
	private String studentName;
	private String course;
	private String grade;

	public Student(String student_id, String student_name, String course, String grade) {
		super();
		this.studentId = student_id;
		this.studentName = student_name;
		this.course = course;
		this.grade = grade;
	}

	public String getStudent_id() {
		return studentId;
	}

	public void setStudent_id(String student_id) {
		this.studentId = student_id;
	}

	public String getStudent_name() {
		return studentName;
	}

	public void setStudent_name(String student_name) {
		this.studentName = student_name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return studentId + ","+ studentName+ ","+ course+ ","+ grade+ ",";
	}

}
