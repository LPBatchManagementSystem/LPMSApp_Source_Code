package com.virtusa.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.AdminModel;
import com.virtusa.model.LpModel;
import com.virtusa.model.MentorModel;
import com.virtusa.service.AdminService;

public class AdminView {
	public static final Scanner scanner = new Scanner(System.in);
	public static void adminMenu()
	{
		System.out.println("*Welocome to Admin HomePage**");
		System.out.println("====================================");
		System.out.println("Please Select any one option");
		System.out.println("1.Profile.");
		System.out.println("2.Mentor.");
		System.out.println("3.LP Batchs");
		System.out.println("4.Training Venue");
		System.out.println("0.Logout");
		System.out.println("====================================");
		init();
		}
	private static void init() {
		 try {
			
	        int cmd = scanner.nextInt();
	        switch (cmd) {
	       
	            case 1:
	               adminProfile();
	                break;
	            case 2:
	                mentor_Tasks();
	                break;
	            case 3:
	                all_LpBatches();
	                break;
	            case 4:
	                training_Venue();
	                break;
	            default : System.out.println("**Please Enter Valid Option**");
	            adminMenu();
	            scanner.close();
	            case 0:
	                LogoutView.LogoutMessage();
	                break;
	        }
		 } catch (Exception ex) {
	            System.err.println("Oops! We have detected an issue.");
	            System.err.println("Please try again.");   
	          
	        }
				}
					
	public static void training_Venue() {
		System.out.println("Welcome to Training Venue Details");
		System.out.println("====================================");
		System.out.println("Please Select any one option");
		System.out.println("41.View Training Venue Details.");
		System.out.println("42.Block Training Venue for LP Batch.");
		System.out.println("Enter '0' to go back to Mentor Menu");
		System.out.println("====================================");
		init4();
	}
	private static void init4() 
	{
		try {
        int cmd4 = scanner.nextInt();
        switch (cmd4) {	      
            case 41:
            	view_Training_Details ();
                break;
            case 42:
            	block_Training_Venue();
                break;
            case 0:
            	adminMenu();
                break;              
            default : System.out.println("**Please Enter Valid Option**");
            training_Venue();
            scanner.close();
                }
	} catch (Exception ex) {
        System.err.println("Oops! We have detected an issue.");
        System.err.println("Please try again.");
         
	}
    }
		
	public static void all_LpBatches() {
		System.out.println("Welcome to  LP Batch Details");
		System.out.println("====================================");
		System.out.println("Please Select any one option");
		System.out.println("31.View LP Batch Details.");
		System.out.println("31.View Training Calender of LP Batchs.");
		System.out.println("Enter '0' to go back to Mentor Menu");
		System.out.println("====================================");
	   init3();
		}
	
	private static void init3() {
		try {
		
        int cmd3 = scanner.nextInt();
        switch (cmd3) {	      
            case 31:
            	lpBatch_Details();
                break;
            case 32:
            	view_Training_Calender();
                break;
            case 0:
            	adminMenu();
                break;              
            default : System.out.println("**Please Enter Valid Option**");
            all_LpBatches();
            scanner.close();
                }
	} catch (Exception ex) {
        System.err.println("Oops! We have detected an issue.");
        System.err.println("Please try again.");
        
    }
	}
	public static void mentor_Tasks() {
		System.out.println("Welcome to Mentor Tasks");
		System.out.println("====================================");
		System.out.println("Please Select any one option");
		System.out.println("21.View Mentor Details");
		System.out.println("22.Assign Mentor to LP Batch");
		System.out.println("23.View Training Status of LP Batches");
		System.out.println("Enter '0' to go back to Mentor Menu");
		System.out.println("====================================");
		init2();
	}
	private static void init2() {
		try {
			
	        int cmd2 = scanner.nextInt();
	        switch (cmd2) {
	        
	            case 21:
	            	view_Mentor_Details();
	                break;
	            case 22:
	            	assign_Mentor();
	                break;
	            case 23:
	            	view_Training_Status();
	                break;
	            case 0:
	            	adminMenu();
	                break;
	            default : System.out.println("**Please Enter Valid Option**");
	            mentor_Tasks();
	            scanner.close();
	                }
	} catch (Exception ex) {
        System.err.println("Oops! We have detected an issue.");
        System.err.println("Please try again.");
       
    }
	}
	public static void adminProfile() {
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
            	view_Admin_Details();
                break;
            case 12:
            	edit_Admin_Details();
                break;
            case 0:
              adminMenu();
                break;
            default : System.out.println("**Please Enter Valid Option**");
            adminProfile();
            scanner.close();
                }	
	} catch (Exception ex) {
        System.err.println("Oops! We have detected an issue.");
        System.err.println("Please try again.");
        
    }
  }
	public static void view_Admin_Details() {
		System.out.println("***View Your Details***");
		try{ 
        	 Connection connection=ConnectionManager.openConnection();  
        	 PreparedStatement stmt=connection.prepareStatement("select * from Admindetails where admin_id=?");
        	 stmt.setString(1, AdminModel.getAdminId());
        	 ResultSet rs=stmt.executeQuery();  
        	 System.out.println("--------------------");
	     		System.out.println("*****My Profile*****");
	     		System.out.println("---------------------");
	     		while(rs.next())
	     		{
	     		System.out.println("Admin Id -:"+rs.getString(1));
	     		System.out.println("Name -:" +rs.getString(2)+ " "+rs.getString(3));
	     		System.out.println("Date of Birth -:"  +rs.getDate(4));
	     		System.out.println("Phone Number-:" +rs.getInt(5));
	     		System.out.println("Email -:"  +rs.getString(6));
	     		System.out.println("Designation -:" +rs.getString(7));
	     		System.out.println("________________________");
	     		}  
	     		connection.close(); 
        	 }catch(Exception e){ System.out.println(e);}  
		AdminView.adminProfile();
	}

	public static void edit_Admin_Details() {
		System.out.println("Edit My Profile");
		try{  
			Scanner scanner =new Scanner(System.in);
			Connection connection=ConnectionManager.openConnection();
			
        	 PreparedStatement stmt=connection.prepareStatement("UPDATE AdminDetails SET first_name=?,last_name=?,dob=?,phone_number=?, email=?  Where admin_id=? ");
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
        	 stmt.setString(6, AdminModel.getAdminId());
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
        	 view_Admin_Details();
 		connection.close(); 
	 }catch(Exception e){ System.out.println(e);} 
		AdminView.adminProfile();
	}

	public static void view_Training_Status() {
		System.out.println("View Training Status");
		AdminView.mentor_Tasks();
	}

	public static void assign_Mentor() {
		System.out.println("Assign Mentor");
		AdminView.mentor_Tasks();
	}

	public static void view_Mentor_Details() {
		System.out.println("View Mentor Details");
		try{  
       	 
       	 Connection connection=ConnectionManager.openConnection();  
       	 java.sql.Statement stmt=connection.createStatement();  
       	 ResultSet rs=stmt.executeQuery("select * from mentordetails"); 
            System.out.println("--------------------");
    		System.out.println("DETAILS OF MENTOR");
    		System.out.println("---------------------");
    		while(rs.next())/**If Record Is Present In DataBase The Display Student Information */
    		{
    		
    		System.out.println("Mentor Id -:"+rs.getString(1));
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
		AdminView.mentor_Tasks();
	}

	public static void view_Training_Calender() {
		System.out.println("View Training Calender");
		AdminView.all_LpBatches();
	}

	public static void lpBatch_Details() {
		System.out.println("View LP Batch Details");
		AdminView.all_LpBatches();
	}

	public static void view_Training_Details() {
		System.out.println("View Training Details");
		AdminView.training_Venue();
	}

	public static void block_Training_Venue() {
		System.out.println("Block Training Venue");
		AdminView.training_Venue();
	}
}
