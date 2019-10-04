package com.virtusa.service;

import com.virtusa.model.LpModel;

public interface LpService {
	
	  default boolean lpAuthenticationService(LpModel lpModel) {
		return false;
	}

}