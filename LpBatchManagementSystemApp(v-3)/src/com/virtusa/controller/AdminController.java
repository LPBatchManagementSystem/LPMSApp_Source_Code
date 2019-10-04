package com.virtusa.controller;

import com.virtusa.helper.FactoryAdminService;
import com.virtusa.model.AdminModel;
import com.virtusa.service.AdminService;
import com.virtusa.view.AdminView;
import com.virtusa.view.LoginView;

public class AdminController {
	
			AdminService adminService;
			public AdminController(){
				
				this.adminService=FactoryAdminService.createAdminService();
			}
			public void adminAuthentication(String adminId,String adminPassword) {
				
				AdminModel adminModel=new AdminModel();
				adminModel.setAdminId(adminId);
				adminModel.setAdminPassword(adminPassword);
	
				boolean adminType=adminService.adminAuthenticationService(adminModel);
				 if(adminType==true) {
				     System.out.println("************************Login Successful****************************");
						
				     AdminView.adminMenu();
					
				}else {
					System.out.println("***Invalid user name or password***");
					System.out.println("***Please Try Again***");
					LoginView.adminLogin();
				
				}		
			}
}


