package UnitTest;

import employees.service.UserService;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import domain.Users;

public class UserServiceTest {
	private static UserService userService;
	 
	 @BeforeClass
	  public static void setup() 
	 {
	  userService = new UserService();
	 }
	 
	 @AfterClass
	    public static void teardown() 
	 {
	  userService = null;
	 }
	 
	    @Test
	 public void testGetUserById() 
	 {
	  Users user = userService.getUserById(1);
	  Assert.assertNotNull(user);
	  System.out.println(user);
	 }
	 
	    @Test
	    public void testGetAllUsers() 
	    {
	  List<Users> users = userService.getAllUsers();
	  Assert.assertNotNull(users);
	  for (Users user : users) 
	  {
	   System.out.println(user);
	  }
	 
	 }
	 
	    @Test
	    public void testInsertUser() 
	    {
	     Users user = new Users();
	     user.setEmailId("test_email_"+System.currentTimeMillis()+"@gmail.com");
	     user.setPassword("secret");
	     user.setFirstName("TestFirstName");
	     user.setLastName("TestLastName");
	 
	     userService.insertUser(user);
	  Assert.assertTrue(user.getUserId() != 0);
	  Users createdUser = userService.getUserById(user.getUserId());
	  Assert.assertNotNull(createdUser);
	  Assert.assertEquals(user.getEmailId(), createdUser.getEmailId());
	  Assert.assertEquals(user.getPassword(), createdUser.getPassword());
	  Assert.assertEquals(user.getFirstName(), createdUser.getFirstName());
	  Assert.assertEquals(user.getLastName(), createdUser.getLastName());
	 
	 }
	 
	    @Test
	    public void testUpdateUser() 
	    {
	     long timestamp = System.currentTimeMillis();
	  Users user = userService.getUserById(2);
	  user.setFirstName("TestFirstName"+timestamp);
	     user.setLastName("TestLastName"+timestamp);
	     userService.updateUser(user);
	  Users updatedUser = userService.getUserById(2);
	  Assert.assertEquals(user.getFirstName(), updatedUser.getFirstName());
	  Assert.assertEquals(user.getLastName(), updatedUser.getLastName());
	 }
	 
	   @Test
	   public void testDeleteUser() 
	   {
	     Users user = userService.getUserById(4);
	     userService.deleteUser(user.getUserId());
	  Users deletedUser = userService.getUserById(4);
	  Assert.assertNull(deletedUser);   
	 
	 }
}
