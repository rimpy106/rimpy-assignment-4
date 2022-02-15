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

		//fileservice.writeStudentstoFile(students);
		Student[] csStudents=new Student[100];
		Student[] apStudents=new Student[100];
		Student[] statsStudents=new Student[100];
		int csCtr=0, apCtr=0,statCtr=0;
		
		for (int i = 0; i < students.length; i++) {
				if (students[i].getCourse().contains("COMPSCI")) {
					csStudents[csCtr]=students[i];
					csCtr++;
				}else if (students[i].getCourse().contains("APMTH")) {
					apStudents[apCtr]=students[i];
					apCtr++;
				}else if (students[i].getCourse().contains("STAT")) {
					statsStudents[statCtr]=students[i];
					statCtr++;
				}
		}
		fileservice.writeStudentstoFile(csStudents,"course1-CompSci.csv");
		fileservice.writeStudentstoFile(apStudents,"course2-APMath.csv");
        fileservice.writeStudentstoFile(statsStudents,"course3-Stat.csv");
				

	}
}
