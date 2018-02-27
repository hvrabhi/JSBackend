package com.niit.dao;
import java.util.List;

import com.niit.model.User;

public interface UserDao {

	public boolean  registerUser(User user);
	
	boolean isEmailvalid(String email);
	
    User login(User user);
	
	public List<User> UserList();

	public void update(User validuser);

	public User getUser(int id);
	
	public void updateuser(User user);
}