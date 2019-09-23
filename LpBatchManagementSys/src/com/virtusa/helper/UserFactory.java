package com.virtusa.helper;


import com.virtusa.dao.UserDAO;
import com.virtusa.dao.UserDAOImpl;
import com.virtusa.service.UserService;
import com.virtusa.service.UserServiceImpl;

public class UserFactory {
	public static UserDAO createUserDAO() {
		UserDAO userDAO=new UserDAOImpl();
		return userDAO;
	}
	public static UserService createUserService() {
		UserService userService=new UserServiceImpl();
		return userService;
	}
}
