package com.virtusa.controller;

import com.virtusa.exception.UserException;
import com.virtusa.helper.UserFactory;
import com.virtusa.model.UserModel;
import com.virtusa.service.UserService;
import com.virtusa.view.StudentView;

public class FrontController {
	private UserService userService;
	public FrontController() {
		this.userService=UserFactory.createUserService();
		
	}
	
	public void userAuthentication(String userName,String password) throws UserException {
		 
		UserModel userModel=new UserModel();
		userModel.setUserName(userName);
		userModel.setPassword(password);
		String userType=
				userService.userAuthenticationService(userModel);
		
		if(userType.contentEquals("STUDENT")) {
			StudentView studentview=new StudentView();
			studentview.mainStudentView();
		}
		
}
}
