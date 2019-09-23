package com.virtusa.dao;

import java.util.List;


import com.virtusa.entities.User;
import com.virtusa.repository.UserRepository;
import com.virtusa.utilities.UserTypes;

public class UserDAOImpl implements UserDAO{
private List<User> userList=null;
	
	public UserDAOImpl() {
		
		this.userList=UserRepository.getUserRepository();
	}

	
	public boolean userAuth(String userName, String password) {
		// TODO Auto-generated method stub
		boolean result=false;
		for(User user:userList) {	
			if(user.getUserName().equals(userName)) {
				
				if(user.getPassword().equals(password)) {
					result= true;
										
				}
			}
		}
		
		return result;
	}

	
	public String retrieveUserType(String userName) {
		// TODO Auto-generated method stub
		
		String returnUserType=null;
		for(User user:userList) {
			if(user.getUserName().equals(userName)){
			UserTypes userTypes=user.getUserType();
			
			switch(userTypes) {
			
			case STUDENT:
				returnUserType="STUDENT";
				break;
				
		
			
			}
			
		}
		}
		return returnUserType;
	}


}
