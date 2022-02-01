package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Assignment4Application {

	public static void main(String[] args) throws IOException {
		Student[] students = new Student[101];
		FileService fileservice = new FileService();
		students=fileservice.readStudentsFromFile("student-master-list.csv");
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				/*
				 * Integer stud1_grade=Integer.parseInt(o1.getGrade()); Integer
				 * stud2_grade=Integer.parseInt(o2.getGrade());
				 */
				return o2.getGrade().compareTo(o1.getGrade());
			}
		
	});
		 
		fileservice.writeStudentstoFile(students);
		/*
		 * for(int i=1;i<students.length;i++) {
		 * System.out.print(students[i].getStudent_id());
		 * System.out.print(students[i].getStudent_name());
		 * System.out.print(students[i].getCourse());
		 * System.out.print(students[i].getGrade()); System.out.println(); }
		 */
}
}
