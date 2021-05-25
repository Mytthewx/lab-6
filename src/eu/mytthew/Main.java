package eu.mytthew;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		SampleReturnClass sampleReturnClass = new SampleReturnClass();
		System.out.println(sampleReturnClass.curtesyPhrase("Jan", "Kowalski", "Szanowny Pan"));
		System.out.println(sampleReturnClass.charSequence("Sample text.", "small"));
		System.out.println(sampleReturnClass.checkFinalExam(40, new ArrayList<>(Arrays.asList(20, 0, 15))));
		System.out.println(sampleReturnClass.howManyChar("Sample text for countering occurrences", 'a'));
		System.out.println(sampleReturnClass.sumOfNumbers(new int[] {20, 12, 20, 20, 17}));
		System.out.println(sampleReturnClass.highestOrLowestNumber(new int[] {10, 12, 12, 10, 15, 14, 1}, "min"));

		Address address = new Address();
		address.setCity("Lublin");
		address.setStreet("Wojska Polskiego");
		address.setHouseNumber(20);
		Company company = new Company(address);
		Person person = new Person(address, company);
		System.out.println(person.getAddress());
		System.out.println(person.getCompany());

		Person2Helper person2Helper = new Person2Helper();
		person2Helper.createListOfPeople(3).forEach(x -> {
			System.out.println("Name: " + x.getName());
			System.out.println("Surname: " + x.getSurname());
			System.out.println("Job: " + x.getJob());
			System.out.println("Age: " + x.getAge());
			System.out.println("----------------------");
		});
	}
}
