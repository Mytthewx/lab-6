package eu.mytthew;

public class Person2 {
	private String name;
	private String surname;
	private String job;
	private int age;

	public Person2(String name, String surname, String job, int age) {
		this.name = name;
		this.surname = surname;
		this.job = job;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
