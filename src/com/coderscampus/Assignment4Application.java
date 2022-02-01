package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Assignment4Application {

	public static void main(String[] args) throws IOException {
		Student[] students = new Student[101];
		FileService fileservice = new FileService();
		students = fileservice.readStudentsFromFile("student-master-list.csv");
		
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getGrade().compareTo(o1.getGrade());
			}
		});

		fileservice.writeStudentstoFile(students);
	}
}
