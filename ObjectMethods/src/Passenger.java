
public class Passenger {
	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// OVERRIDING TOSTRING METHOD
	public String toString() {
		return "Passenger name: " + this.getFirstName() + " " + this.getLastName();
	}

	// OVERRIDE THE HASHCODEMETHOD
	public int hashCode() {
		return id;
	}

	// OVERRIDE THE EQUALS METHOD
	// write equals then ctrl+space to override equals method
	@Override
	public boolean equals(Object obj) {
		Passenger passenger = (Passenger) obj;
		if (passenger.getId() == this.id && passenger.getFirstName().equals(this.firstName)
				&& passenger.getLastName().equals(this.lastName)) {
			return true;
		}
		return false;
	}

}
