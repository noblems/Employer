package employees.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import domain.Users;
import mappers.UsersMappers;

public class UserService {
	public void insertUsers(Users user) {
		  SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		  try{
		  UsersMappers userMapper = sqlSession.getMapper(UsersMappers.class);
		  userMapper.insertUsers(user);
		  sqlSession.commit();
		  }finally{
		   sqlSession.close();
		  }
		 }
		 
		 public Users getUserById(Integer userId) {
		  SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		  try{
		  UsersMappers userMapper = sqlSession.getMapper(UsersMappers.class);
		  return userMapper.getUsersById(userId);
		  }finally{
		   sqlSession.close();
		  }
		 }
		 
		 public List<Users> getAllUsers() {
		  SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		  try{
		  UsersMappers userMapper = sqlSession.getMapper(UsersMappers.class);
		  return userMapper.getAllUsers();
		  }finally{
		   sqlSession.close();
		  }
		 }
		 
		 public void updateUser(Users user) {
		  SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		  try{
		  UsersMappers userMapper = sqlSession.getMapper(UsersMappers.class);
		  userMapper.updateUsers(user);
		  sqlSession.commit();
		  }finally{
		   sqlSession.close();
		  }
		 
		 }
		 
		 public void deleteUser(Integer userId) {
		  SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		  try{
		  UsersMappers userMapper = sqlSession.getMapper(UsersMappers.class);
		  userMapper.deleteUsers(userId);
		  sqlSession.commit();
		  }finally{
		   sqlSession.close();
		  }
		 
		 }
}
