package com.virtusa.helper;

import com.virtusa.service.LpService;
import com.virtusa.service.LpServiceImpl;

public class FactoryLpService {
	
	public static LpService createLpService() {
		
	
		LpService lpService=new LpServiceImpl();
	return lpService;

}
	
}
