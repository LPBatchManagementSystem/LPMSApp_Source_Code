package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.service.LpService;

public class LpView {
	public static final Scanner scanner = new Scanner(System.in);
		public static void lpMenu()
		{
			
			System.out.println("*Welocome to LP HomePage**");
			System.out.println("====================================");
			System.out.println("Please Select any one option");
			System.out.println("1.My Profile.");
			System.out.println("2.View Training Calender");
			System.out.println("3.View Training Status");
			System.out.println("4.LP Batch");
			System.out.println("5.Logout");
			System.out.println("====================================");
			init();
		}
	
		private static void init() {
			 try {
		        int cmd = scanner.nextInt();
		        switch (cmd) {
		       
		            case 1:
		               lpProfile();
		                break;
		            case 2:
		                view_Training_Calender();
		                break;
		            case 3:
		            	view_Training_Status();
		                break;
		            case 4:
		                lp_Batch();
		                break;
		            case 5:
		                logOut();
		                break;
		            default : System.out.println("**Please Enter Valid Option**");
		            lpMenu();
		        }
			 } catch (Exception ex) {
		            System.err.println("Oops! We have detected an issue.");
		            System.err.println("Please try again.");
		        }
					}
		
		private static void view_Training_Calender() {
			System.out.println("View Training Calender");
			
		}
		private static void view_Training_Status() {
			System.out.println("View Training Status");
			
		}
		
		private static void lp_Batch() {
			System.out.println("Welcome to  LP Batch Details");
			System.out.println("====================================");
			System.out.println("Please Select any one option");
			System.out.println("31.Enroll in LP Batch.");
			System.out.println("31.View LP Batchs details.");
			System.out.println("Enter '0' to go back to Lp Menu");
			System.out.println("====================================");
		   init2();
			}
		
		private static void init2() {
			try {
	        int cmd2 = scanner.nextInt();
	        switch (cmd2) {	      
	            case 21:
	            	LpService.enroll();
	                break;
	            case 22:
	            	LpService.view_MyLpBatch_Details();
	                break;
	            case 0:
	            	lpMenu();
	                break;              
	            default : System.out.println("**Please Enter Valid Option**");
	            lp_Batch();
	                }
		} catch (Exception ex) {
	        System.err.println("Oops! We have detected an issue.");
	        System.err.println("Please try again.");
	    }
			
		}
		private static void logOut() {
			System.out.println("Logout Done! ");
		}	
		private static void lpProfile() {
			System.out.println("My Profile");
			System.out.println("====================================");
			System.out.println("Please Select any one option");
			System.out.println("11.View Your Profile");
			System.out.println("12.Edit Your Profile");
			System.out.println("Enter '0' to go back to LP Menu");
			System.out.println("====================================");
			init1();
			}
		
		private static void init1() {
			try {
	        int cmd1 = scanner.nextInt();
	        switch (cmd1) {	      
	            case 11:
	            	LpService.view_Lp_Details();
	                break;
	            case 12:
	            	LpService.edit_Lp_Details();
	                break;
	            case 0:
	              lpMenu();
	                break;
	            default : System.out.println("**Please Enter Valid Option**");
	            lpProfile();
	                }	
		} catch (Exception ex) {
	        System.err.println("Oops! We have detected an issue.");
	        System.err.println("Please try again.");
	    }
	}
}
