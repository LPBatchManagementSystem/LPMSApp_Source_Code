package com.virtusa.controller;

import com.virtusa.helper.FactoryLpService;
import com.virtusa.model.LpModel;
import com.virtusa.service.LpService;
import com.virtusa.view.LpView;
import com.virtusa.view.LoginView;

public class LpController {
	
			LpService lpService;
			public LpController(){
				
				this.lpService=FactoryLpService.createLpService();
			}
			public void lpAuthentication(String lpId,String lpPassword) {
				
				LpModel lpModel=new LpModel();
				lpModel.setLpId(lpId);
				lpModel.setLpPassword(lpPassword);
	
				boolean lpType=lpService.lpAuthenticationService(lpModel);
				 if(lpType==true) {
				     System.out.println("************************Login Successful****************************");
						
				     LpView.lpMenu();
					
				}else {
					System.out.println("***Invalid user name or password***");
					System.out.println("***Please Try Again***");
					LoginView.lpLogin();
				
				}		
			}
}
