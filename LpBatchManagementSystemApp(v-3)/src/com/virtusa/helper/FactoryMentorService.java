package com.virtusa.helper;

import com.virtusa.service.MentorService;
import com.virtusa.service.MentorServiceImpl;

public class FactoryMentorService {
	
	public static MentorService createMentorService() {
		
	
		MentorService mentorService=new MentorServiceImpl();
	return mentorService;

}
	
}
