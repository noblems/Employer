package mappers;

import java.util.List;

import domain.Users;

public interface UsersMappers {
	public void insertUsers(Users user);
	 
	 public Users getUsersById(Integer userId);
	 
	 public List<Users> getAllUsers();
	 
	 public void updateUsers(Users user);
	 
	 public void deleteUsers(Integer userId);

}
