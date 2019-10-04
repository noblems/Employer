package mappers;

import java.util.List;

import domain.Users;

public interface UsersMappers {
	public void insertUser(Users user);
	 
	 public Users getUserById(Integer userId);
	 
	 public List<Users> getAllUsers();
	 
	 public void updateUser(Users user);
	 
	 public void deleteUser(Integer userId);

}
