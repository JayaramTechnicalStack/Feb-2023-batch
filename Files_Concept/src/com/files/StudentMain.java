package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentMain {
	public static void main(String args[]) throws IOException {

		
		/*
		 * FileOutputStream fout = null; ObjectOutputStream out = null;
		 * 
		 * try {
		 * 
		 * Student s1 = new Student(211, "ravi", 23, "java");
		 * 
		 * fout = new FileOutputStream("student.txt");
		 * 
		 * out = new ObjectOutputStream(fout);
		 * 
		 * out.writeObject(s1);
		 * 
		 * System.out.println("Student object is saved successfully !!"); } catch
		 * (Exception e) { e.printStackTrace(); } finally { out.flush(); out.close();
		 * fout.close(); }
		 */
		
		
		
		try {
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Student student = (Student) ois.readObject();
			System.out.println("Student Object Info from file :");
			System.out.println("Student id is :" + student.getId());
			System.out.println("Student Name is :" + student.getName());
			System.out.println("Student age is :" + student.getAge());
			System.out.println("Student Course is :" + student.getCourse());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
