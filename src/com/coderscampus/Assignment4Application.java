package com.coderscampus;

import java.io.IOException;

public class Assignment4Application {

	public static void main(String[] args) throws IOException {
		Student[] students = new Student[101];
		FileService fileservice = new FileService();
		students=fileservice.readStudentsFromFile("student-master-list.csv");
		
		
		/*
		 * for(int i=1;i<students.length;i++) {
		 * System.out.print(students[i].getStudent_id());
		 * System.out.print(students[i].getStudent_name());
		 * System.out.print(students[i].getCourse());
		 * System.out.print(students[i].getGrade()); System.out.println(); }
		 */
		 
		fileservice.writeStudentstoFile(students);
	}

}
