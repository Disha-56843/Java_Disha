package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {

	public void addOrUpdateUser(User u);
	public List<User> viewAllUser();
	public void deleteUser(int id);
	public User userById(int id);
	
}
