package com.coderscampus;

import java.io.IOException;

public class Assignment4Application {

	public static void main(String[] args) throws IOException {
		Student[] students = new Student[101];
		FileService fileservice = new FileService();
		students=fileservice.readStudentsFromFile("student-master-list.csv");
		
		/*
		 * for(int i=1;i<students.length;i++) {
		 * System.out.println(students[i].toString()); }
		 */
		fileservice.writeStudentstoFile(students);
	}

}
