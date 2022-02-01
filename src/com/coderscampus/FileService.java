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

public class FileService {
	private static final String COMMA_DELIMITER = ",";
	public Student[] readStudentsFromFile(String file) {
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return students;

	}
	
	public void writeStudentstoFile(Student[] students) throws IOException {
		BufferedWriter filewriter=null;
		for(int i=0;i<students.length;i++) {
			if(students[i].getCourse().contains("COMPSCI")) {
				//System.out.println(students[i].toString());
				filewriter=new BufferedWriter(new FileWriter("course1.csv"));
				filewriter.write(students[i].getStudent_id());
				filewriter.write(COMMA_DELIMITER);
				filewriter.write(students[i].getStudent_name());
				filewriter.write(COMMA_DELIMITER);
				filewriter.write(students[i].getCourse());
				filewriter.write(COMMA_DELIMITER);
				filewriter.write(students[i].getGrade());
				filewriter.write("\n");
			}else if(students[i].getCourse().contains("APMTH")) {
				filewriter=new BufferedWriter(new FileWriter("course2.csv"));
				filewriter.write(students[i].getStudent_id());
				filewriter.write(COMMA_DELIMITER);
				filewriter.write(students[i].getStudent_name());
				filewriter.write(COMMA_DELIMITER);
				filewriter.write(students[i].getCourse());
				filewriter.write(COMMA_DELIMITER);
				filewriter.write(students[i].getGrade());
				filewriter.write("\n");
			}else if(students[i].getCourse().contains("STAT")) {
				filewriter=new BufferedWriter(new FileWriter("course3.csv"));
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
	}

}
