package domain;

public class Users {
	 private int userId;
	 private String emailId;
	 private String password;
	 private String firstName;
	 private String lastName;
	 
	 @Override
	 public String toString() {
	  return "Users [userId=" + userId + ", emailId=" + emailId+ ", password=" + password + ", firstName=" + firstName+ ", lastName=" + lastName + "]";
	 }
	 
	 public void setUserId(int userId) {
		 this.userId=userId;
	 }
	 public int getUserId() {
		 return this.userId;
	 }
	 public void setEmailId(String emailId) {
		 this.emailId=emailId;
	 }
	 public String getEmailId() {
		 return this.emailId;
	 }
	 public void setPassword(String password) {
		 this.password=password;
	 }
	 public String getPassword() {
		 return this.password;
	 }
	 public void setFirstName(String firstName) {
		 this.firstName=firstName;
	 }
	 public String getFirstName() {
		 return this.firstName;
	 }
	 public void setLastName(String lastName) {
		 this.lastName=lastName;
	 }
	 public String getLastName() {
		 return this.lastName;
	 }
}
