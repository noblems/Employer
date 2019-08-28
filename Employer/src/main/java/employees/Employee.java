package employees;

public class Employee {
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Employee(String firstName, String middleName, String lastName) {
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	/*public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName=middleName;
	}public void setLastName(String lastName) {
		this.lastName=lastName;
	}*/
	public String getMiddleName() {
		return this.middleName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	

}
