package com.virtusa.repository;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Student;
import com.virtusa.entities.User;
import com.virtusa.utilities.UserTypes;



public class UserRepository {
	private static List<User> userRepository=
			new ArrayList<User>();
	static{
		
		User user=new User();
		user.setUserName("durga");
		user.setPassword("durga");
		user.setFirstName("durga");
		user.setLastName("devi");
		user.setEmailAddress("durga@hotmail.com");
		user.setPhoneNumber("9892937467");
		user.setDateOfBirth("01-10-1977");
		user.setUserType(UserTypes.STUDENT);
		userRepository.add(user);
		
	
	}
	public static List<User> getUserRepository() {
		return userRepository;
	}
}
