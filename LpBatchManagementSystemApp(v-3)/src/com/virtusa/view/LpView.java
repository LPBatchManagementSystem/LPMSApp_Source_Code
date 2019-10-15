package com.virtusa.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.LpModel;
import com.virtusa.model.MentorModel;
import com.virtusa.service.LpService;

public class LpView {
	public static final Scanner scanner = new Scanner(System.in);
		public static void lpMenu()
		{
			System.out.println("***Welocome to LP HomePage***");
			System.out.println("====================================");
			System.out.println("Please Select any one option");
			System.out.println("1.My Profile.");
			System.out.println("2.View Training Calender");
			System.out.println("3.View Training Status");
			System.out.println("4.LP Batch");
			System.out.println("0.Logout");
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
		            default : System.out.println("**Please Enter Valid Option**");
		            lpMenu();
		            case 0:
		                LogoutView.LogoutMessage();
		                break;
		        }
			 } catch (Exception ex) {
		            System.err.println("Oops! We have detected an issue.");
		            System.err.println("Please try again.");
		        }
					}
		
		private static void view_Training_Calender() {
			System.out.println("View Training Calender");
			lpMenu();
			
		}
		private static void view_Training_Status() {
			System.out.println("View Training Status");
			lpMenu();
			
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
	            	enroll();
	                break;
	            case 22:
	            	view_MyLpBatch_Details();
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
	            	view_Lp_Details();
	                break;
	            case 12:
	            	edit_Lp_Details();
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
		 public static void edit_Lp_Details() {
				System.out.println("Edit My Profile");
				try{  
					Scanner scanner =new Scanner(System.in);
					Connection connection=ConnectionManager.openConnection();
					
		        	 PreparedStatement stmt=connection.prepareStatement("UPDATE LpDetails SET first_name=?,last_name=?,dob=?,phone_number=?, email=?  Where lp_id=? ");
		        	 System.out.println("Enter First Name: ");
		        	 String first_Name=scanner.next();
		        	 System.out.println("Enter Last Name: ");
		        	 String last_Name=scanner.next();
		        	 System.out.println("Enter Date Of Birth: ");
		        	 String dOB=scanner.next();
		        	 System.out.println("Enter Phone Number: ");
		        	 int phone_Number=scanner.nextInt();
		        	 System.out.println("Enter Email Id: ");
		        	 String email=scanner.next();
		        	 stmt.setString(1,first_Name);
		        	 stmt.setString(2,last_Name );
		        	 stmt.setString(3, dOB);
		        	 stmt.setInt(4, phone_Number);
		        	 stmt.setString(5,email );
		        	 stmt.setString(6, LpModel.getLpId());
		        	 int rs=stmt.executeUpdate(); 
		        	 if(rs > 0)
		        	 {
		        	System.out.println("Record Updated Successfully");
		        	 }
		        	 else
		        	 {
		        	  System.out.println("There is a problem in updating Record.");
		        	 } 
		        	 System.out.println("******Updated Profile******");
		        	 view_Lp_Details();
	     		connection.close(); 
	    	 }catch(Exception e){ System.out.println(e);} 
	    	 
				lpProfile();
			}

			public static void view_Lp_Details() {
				System.out.println("View My Profile");
				try{  
		        	 Connection connection=ConnectionManager.openConnection();  
		        	 PreparedStatement stmt=connection.prepareStatement("select * from Lpdetails where Lp_id=?");
		        	 //System.out.println(LpModel.getLpId());
		        	 stmt.setString(1, LpModel.getLpId());
		        	 ResultSet rs=stmt.executeQuery();  
		        	
			     		while(rs.next())
			     		{
			     		System.out.println("--------------------");
			     		System.out.println("*****My Profile*****");
			     		System.out.println("---------------------");
			     		System.out.println("Lp Id -:"+rs.getString(1));
			     		System.out.println("Name -:" +rs.getString(2)+ " "+rs.getString(3));
			     		System.out.println("Date of Birth -:"  +rs.getDate(4));
			     		System.out.println("Phone Number-:" +rs.getInt(5));
			     		System.out.println("Email -:"  +rs.getString(6));
			     		System.out.println("Designation -:" +rs.getString(7));
			     		System.out.println("Batch Id -:"  +rs.getString(8));
			     		System.out.println("________________________");
			     		}  
			     		connection.close(); 
		        	 }catch(Exception e){ System.out.println(e);} 
				lpProfile();
			}

			public static void enroll() {
				System.out.println("Enroll in");
				lp_Batch();
				
			}

			public static void view_MyLpBatch_Details() {
				System.out.println("View My Profile");
				lp_Batch();
				
			}
}
