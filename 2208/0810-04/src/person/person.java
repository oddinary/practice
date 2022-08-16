package person;

public class person {
	private String firstname;
	private String lastname;
	private int age;
	private String email;
	
	public person(String firstname, String lastname, int age, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
	}

	@Override
	public String toString() {
		return lastname + firstname + ", 나이: " + age + ", 이메일: " + email;
	}
	
	
}
