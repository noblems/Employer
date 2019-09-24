package employees;

public class Employee {
	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getSalary() {
		return this.salary;
	}
	/*private String firstName;
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
	/*public String getMiddleName() {
		return this.middleName;
	}
	
	public String getLastName() {
		return this.lastName;
	}*/
	

}
