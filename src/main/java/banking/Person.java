package banking;

public class Person extends AccountHolder{
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName, int idNumber) {
		// complete the function
		super(idNumber);
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public String getFirstName() {
		// complete the function
		if(!this.firstName.isEmpty())
			return this.firstName;
        return null;
	}

	public String getLastName() {
		// complete the function
		if(!this.lastName.isEmpty())
			return this.lastName;
        return null;
	}
}
