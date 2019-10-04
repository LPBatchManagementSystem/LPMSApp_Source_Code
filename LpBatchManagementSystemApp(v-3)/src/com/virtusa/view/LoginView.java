package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.AdminController;
import com.virtusa.controller.LpController;
import com.virtusa.controller.MentorController;

public class LoginView {

	public static Scanner scanner=new Scanner(System.in);
	
	public static void adminLogin() {
		
		System.out.println("Enter Admin Id:");
		String adminId=scanner.next();
		System.out.println("Enter Password:");
		String adminPassword=scanner.next();
		
		AdminController adminController=new AdminController();
		adminController.adminAuthentication(adminId, adminPassword);
	}
	public static void mentorLogin() {
		
		System.out.println("Enter Mentor Id:");
		String mentorId=scanner.next();
		System.out.println("Enter Password:");
		String mentorPassword=scanner.next();
		
		MentorController mentorController=new MentorController();
		mentorController.mentorAuthentication(mentorId, mentorPassword);
	}

	public static void lpLogin() {
		System.out.println("Enter Lp Id:");
		String lpId=scanner.next();
		System.out.println("Enter Password:");
		String lpPassword=scanner.next();
		
		LpController lpController=new LpController();
		lpController.lpAuthentication(lpId, lpPassword);
	}
}
