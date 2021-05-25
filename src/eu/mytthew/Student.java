package eu.mytthew;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Student {
	String name;
	String surname;
	Map<String, List<Double>> subjectsWithGrades = new HashMap<>();
	private final Scanner scan = new Scanner(System.in);

	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void enterSubjects(int amountOfSubjects) {
		for (int i = 0; i < amountOfSubjects; i++) {
			String subject = scan.nextLine();
			subjectsWithGrades.put(subject, new LinkedList<>());
		}
	}

	public void enterGrades(String subjectName, int amountOfGrades) {
		for (int i = 0; i < amountOfGrades; i++) {
			double grade = scan.nextDouble();
			subjectsWithGrades.get(subjectName).add(grade);
		}
	}

	public void displaySubjectWithGrades() {
		for (String subject: subjectsWithGrades.keySet()) {
			System.out.print("Subject: " + subject + " grades: ");
			for (double grade: subjectsWithGrades.get(subject)) {
				System.out.print(grade + "; ");
			}
			System.out.println();
		}
	}

}
