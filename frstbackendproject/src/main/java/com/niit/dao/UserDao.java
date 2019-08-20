package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDao 
{
	 public boolean addUser(User User);
	   public boolean deleteUser(User User);
	   public boolean updateUser(User User);
	   public List<User> listUsers();
	   public User getUser(int UserID);


}
