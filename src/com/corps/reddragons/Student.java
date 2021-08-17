package com.corps.reddragons;

public class Student {

	String name;
	String fatherName;
	int numb_of_subjects;

	public Student(String name, String fatherName, int numb_of_subjects) {

		this.name = name;
		this.fatherName = fatherName;
		this.numb_of_subjects = numb_of_subjects;

	}

	public static void displayname(Student s) {

		System.out.println("The name of student is :" + s.name);
	}

	public static void displayFathername(Student s) {

		System.out.println("The name of student is :" + s.fatherName);
	}

	public static void display_numb_of_sub(Student s) {

		System.out.println("The name of student is :" + s.numb_of_subjects);
	}

}
