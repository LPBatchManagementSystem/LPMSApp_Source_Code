package com.virtusa.controller;

import com.virtusa.helper.FactoryMentorService;
import com.virtusa.model.MentorModel;
import com.virtusa.service.MentorService;
import com.virtusa.view.MentorView;
import com.virtusa.view.LoginView;

public class MentorController {
	
			MentorService mentorService;
			public MentorController(){
				
				this.mentorService=FactoryMentorService.createMentorService();
			}
			public void mentorAuthentication(String mentorId,String mentorPassword) {
				
				MentorModel mentorModel=new MentorModel();
				mentorModel.setMentorId(mentorId);
				mentorModel.setMentorPassword(mentorPassword);
	
				boolean mentorType=mentorService.mentorAuthenticationService(mentorModel);
				 if(mentorType==true) {
				     System.out.println("************************Login Successful****************************");
						
				     MentorView.mentorMenu();
					
				}else {
					System.out.println("***Invalid user name or password***");
					System.out.println("***Please Try Again***");
					LoginView.mentorLogin();
				
				}		
			}
}

