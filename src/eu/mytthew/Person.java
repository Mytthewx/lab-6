package eu.mytthew;

public class Person {
	private Address address;
	private Company company;

	public Person(Address address, Company company) {
		this.address = address;
		this.company = company;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
