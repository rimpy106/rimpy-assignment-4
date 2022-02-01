package com.coderscampus;

public class Student {
	private String student_id;
	private String student_name;
	private String course;
	private String grade;

	public Student(String student_id, String student_name, String course, String grade) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.course = course;
		this.grade = grade;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
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
		return student_id + ","+ student_name+ ","+ course+ ","+ grade+ ",";
	}

}
