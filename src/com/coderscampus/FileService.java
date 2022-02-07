package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class FileService {
	private static final String COMMA_DELIMITER = ",";
	private static final String fileHeader = "Student ID,Student Name, Course,Grade \n";

	public Student[] readStudentsFromFile(String file) throws IOException {
		BufferedReader filereader = null;
		Student[] students = new Student[101];
		try {
			filereader = new BufferedReader(new FileReader(file));
			String line;
			int i = 0;
			while ((line = filereader.readLine()) != null) {
				String[] lineData = line.split(",");
				students[i] = new Student(lineData[0], lineData[1], lineData[2], lineData[3]);
				i++;
			}
		} finally {
			if (filereader != null)
				filereader.close();
		}
		return students;
	}

	public void writeStudentstoFile(Student[] students, String filename) throws IOException {
		BufferedWriter filewriter = new BufferedWriter(new FileWriter(filename));
		filewriter.write(fileHeader);
		try {
			for (int i = 1; i < students.length; i++) {
				if (students[i] != null) {
					filewriter.write(students[i].getStudent_id());
					filewriter.write(COMMA_DELIMITER);
					filewriter.write(students[i].getStudent_name());
					filewriter.write(COMMA_DELIMITER);
					filewriter.write(students[i].getCourse());
					filewriter.write(COMMA_DELIMITER);
					filewriter.write(students[i].getGrade());
					filewriter.write("\n");
				}
			}
		} finally {
			filewriter.close();
		}
	}

	public void writeStudentstoFile(Student[] students) throws IOException {
		BufferedWriter filewriter1 = new BufferedWriter(new FileWriter("course1.csv"));
		filewriter1.write(fileHeader);
		BufferedWriter filewriter2 = new BufferedWriter(new FileWriter("course2.csv"));
		filewriter2.write(fileHeader);
		BufferedWriter filewriter3 = new BufferedWriter(new FileWriter("course3.csv"));
		filewriter3.write(fileHeader);
		try {
			for (int i = 1; i < students.length; i++) {
				if (students[i] != null) {
					if (students[i].getCourse().contains("COMPSCI")) {
						filewriter1.write(students[i].getStudent_id());
						filewriter1.write(COMMA_DELIMITER);
						filewriter1.write(students[i].getStudent_name());
						filewriter1.write(COMMA_DELIMITER);
						filewriter1.write(students[i].getCourse());
						filewriter1.write(COMMA_DELIMITER);
						filewriter1.write(students[i].getGrade());
						filewriter1.write("\n");
					} else if (students[i].getCourse().contains("APMTH")) {
						filewriter2.write(students[i].getStudent_id());
						filewriter2.write(COMMA_DELIMITER);
						filewriter2.write(students[i].getStudent_name());
						filewriter2.write(COMMA_DELIMITER);
						filewriter2.write(students[i].getCourse());
						filewriter2.write(COMMA_DELIMITER);
						filewriter2.write(students[i].getGrade());
						filewriter2.write("\n");
					} else if (students[i].getCourse().contains("STAT")) {
						filewriter3.write(students[i].getStudent_id());
						filewriter3.write(COMMA_DELIMITER);
						filewriter3.write(students[i].getStudent_name());
						filewriter3.write(COMMA_DELIMITER);
						filewriter3.write(students[i].getCourse());
						filewriter3.write(COMMA_DELIMITER);
						filewriter3.write(students[i].getGrade());
						filewriter3.write("\n");
					}
				}
			}
		} finally {
			if (filewriter1 != null)
				filewriter1.close();
			if (filewriter2 != null)
				filewriter2.close();
			if (filewriter3 != null)
				filewriter3.close();
		}
	}
}
