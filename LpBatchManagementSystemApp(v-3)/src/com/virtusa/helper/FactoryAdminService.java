package com.virtusa.helper;

import com.virtusa.service.AdminService;
import com.virtusa.service.AdminServiceImpl;

public class FactoryAdminService {
	
	public static AdminService createAdminService() {
		
	
		AdminService adminService=new AdminServiceImpl();
	return adminService;

}
	
}
