package com.virtusa.service;

import com.virtusa.model.AdminModel;

public interface AdminService {
	
	 default boolean adminAuthenticationService(AdminModel adminModel) {
		return false;
		
	}

}

