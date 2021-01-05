package amrib.cleancode.main;

public class User {

	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private boolean active;

	public User(String firstname, String lastname, String email, boolean active) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.active = active;
	}

	public static User userDefault(String firstname, String lastname) {
		String email = firstname + "." + lastname + "@gmail.com";
		return new User(firstname, lastname, email, true);
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean getActive() {
		return this.active;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", active=" + active
				+ "]";
	}

}
