package com.virtusa.view;
import java.util.Scanner;

import com.virtusa.service.MentorService;

public class MentorView 
	{
		public static final Scanner scanner = new Scanner(System.in);
		public static void mentorMenu()
		{
			System.out.println("*Welocome to Mentor HomePage**");
			System.out.println("====================================");
			System.out.println("Please Select any one option");
			System.out.println("1.Profile");
			System.out.println("2.Training Calender");
			System.out.println("3.LP's");
			System.out.println("4.My LP Batch");
			System.out.println("0.Logout");
			System.out.println("====================================");
			init();
		}
	
		private static void init() {
			 try {
		        int cmd = scanner.nextInt();
		        switch (cmd) {
		       
		            case 1:
		               mentorProfile();
		                break;
		            case 2:
		                training_Calender();
		                break;
		            case 3:
		                all_Lps();
		                break;
		            case 4:
		                my_Lp_Batch();
		                break;
		            default : System.out.println("**Please Enter Valid Option**");
		            mentorMenu();
		            case 0:
		                LogoutView.LogoutMessage();
		                break;
		            
		        }
		} catch (Exception ex) {
            System.err.println("Oops! We have detected an issue.");
            System.err.println("Please try again.");
        }
			}
		
		
		public static void mentorProfile() {
			System.out.println("My Profile");
			System.out.println("====================================");
			System.out.println("Please Select any one option");
			System.out.println("11.View Your Profile");
			System.out.println("12.Edit Your Profile");
			System.out.println("Enter '0' to go back to Mentor Menu");
			System.out.println("====================================");
			init1();
			}
		
		private static void init1() {
			try {
	        int cmd1 = scanner.nextInt();
	        switch (cmd1) {	      
	            case 11:
	            	view_Mentor_Details();
	                break;
	            case 12:
	                 edit_Mentor_Details();
	                break;
	            case 0:
	              mentorMenu();
	                break;
	            default : System.out.println("**Please Enter Valid Option**");
	            mentorProfile();
	                }	
		} catch (Exception ex) {
            System.err.println("Oops! We have detected an issue.");
            System.err.println("Please try again.");
        }
	}
		public static void training_Calender() 
		{
			System.out.println("Welcome to Training Calender");
			System.out.println("====================================");
			System.out.println("Please Select any one option");
			System.out.println("21.View Training Calender");
			System.out.println("22.Upload/Update Training Calender of your LP Batch");
			System.out.println("23.View Training Status");
			System.out.println("24.Upload Training Status of your LP Batch");	
			System.out.println("Enter '0' to go back to Mentor Menu");
			System.out.println("====================================");
			init2();
			}
		

	private static void init2() {
		try {
	        int cmd2 = scanner.nextInt();
	        switch (cmd2) {
	        
	            case 21:
	            	view_Training_Calender();
	                break;
	            case 22:
	            	edit_Training_Calender();
	                break;
	            case 23:
	            	view_Training_Status();
	                break;
	            case 24:
	            	edit_Training_Status();
	                break;
	            case 0:
	            	mentorMenu();
	                break;
	            default : System.out.println("**Please Enter Valid Option**");
	            training_Calender();
	                }
	} catch (Exception ex) {
        System.err.println("Oops! We have detected an issue.");
        System.err.println("Please try again.");
    }
		}	
		public static void all_Lps() 
		{
			System.out.println("Welcome to Lp Details");
			System.out.println("====================================");
			System.out.println("Please Select any one option");
			System.out.println("31.View LP Profile");
			System.out.println("32.Enroll LP's to My Batch");
			System.out.println("Enter '0' to go back to Mentor Menu");
			System.out.println("====================================");
		   init3();
			}
		
		private static void init3() {
			try {
	        int cmd3 = scanner.nextInt();
	        switch (cmd3) {	      
	            case 31:
	            	view_Lp_Details();
	                break;
	            case 32:
	            	enroll_Lps();
	                break;
	            case 0:
	            	mentorMenu();
	                break;              
	            default : System.out.println("**Please Enter Valid Option**");
	            all_Lps();
	                }
		} catch (Exception ex) {
            System.err.println("Oops! We have detected an issue.");
            System.err.println("Please try again.");
        }
		}
		public static void my_Lp_Batch() 
		{
			System.out.println("MY LP Batch");
			System.out.println("====================================");
			System.out.println("Please Select any one option");
			System.out.println("41.Create New Batch");
			System.out.println("42.View My LP Batch Details");
			System.out.println("Enter '0' to go back to Mentor Menu");
			System.out.println("====================================");
		    init4();
			}
		
		private static void init4() {
			try {
	        int cmd1 = scanner.nextInt();
	        switch (cmd1) {	      
	            case 41:
	            	create_New_Batch();
	                break;
	            case 42:
	            	View_MyLPBatch_Details();
	                break;
	            case 0:
	            	mentorMenu();
	                break;
	            default : System.out.println("**Please Enter Valid Option**");
	            my_Lp_Batch();
	                }
		} catch (Exception ex) {
            System.err.println("Oops! We have detected an issue.");
            System.err.println("Please try again.");
        }
		}
		public static void view_Training_Calender() {
			System.out.println("View Training Calender");
			MentorView.training_Calender();
			
		}
		public static void edit_Training_Calender() {
			System.out.println("Edit Training Calender");
			MentorView.training_Calender();
			
		}
		public static void view_Training_Status() {
			System.out.println("***View Training Status***");
			
			MentorView.training_Calender();
			
		}
		public static void edit_Training_Status() {
			MentorView.training_Calender();
			
		}
		public static void view_Mentor_Details() {
			System.out.println("***View Your Details***");
			MentorView.mentorProfile();
		}
		public static void edit_Mentor_Details() {
			System.out.println("***Edit your Details***");
			MentorView.mentorProfile();
		}
		public static void create_New_Batch() {
			System.out.println("***Create a New Batch***");
			MentorView.my_Lp_Batch();
			
		}
		public static void View_MyLPBatch_Details() {
				System.out.println("***My LP Batch Details***");
				MentorView.my_Lp_Batch();
			
		}
		public static void enroll_Lps() {
				System.out.println("***Enroll LPs***");
				MentorView.all_Lps();
			}

		public static void view_Lp_Details() {
			         System.out.println("***View Lp Details***");
			         MentorView.all_Lps();
			}
		
	}
