package com.virtusa.service;

import com.virtusa.model.MentorModel;

public interface MentorService {


	 default boolean mentorAuthenticationService(MentorModel mentorModel) {
		return false;
	}
}


