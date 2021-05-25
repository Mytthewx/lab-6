package eu.mytthew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person2Helper {
	List<Person2> personList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public Person2 createPerson() {
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		System.out.println("Enter surname: ");
		String surname = scanner.nextLine();
		System.out.println("Enter job: ");
		String job = scanner.nextLine();
		System.out.println("Enter age: ");
		int age = Integer.parseInt(scanner.nextLine());
		return new Person2(name, surname, job, age);
	}

	public List<Person2> createListOfPeople(int amount) {
		for (int i = 0; i < amount; i++) {
			personList.add(createPerson());
		}
		return personList;
	}

	@Override
	public String toString() {
		return "Person2Helper{" +
				"personList=" + personList +
				'}';
	}
}
