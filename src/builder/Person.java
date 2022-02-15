package builder;

public class Person {
	private String firstName;
	private String lastName;
	private String age;
	private String country;

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	Person(String firstName, String lastName, String age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	Person(String firstName, String lastName, String age, String country) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
	}

}
