package com.virtusa.view;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

import com.virtusa.entities.Mentor;
import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.MentorModel;
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
		public static void view_Mentor_Details() {
			System.out.println("***View Your Details***");
			try{  
	        	 Connection connection=ConnectionManager.openConnection();  
	        	 PreparedStatement stmt=connection.prepareStatement("select * from mentordetails where Mentor_id=?");
	        	 stmt.setString(1, MentorModel.getMentorId());
	        	 ResultSet rs=stmt.executeQuery();  
	        	 System.out.println("--------------------");
		     		System.out.println("*****My Profile*****");
		     		System.out.println("---------------------");
		     		while(rs.next())
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
			MentorView.mentorProfile();
		}
		
		public static void edit_Mentor_Details() {
			System.out.println("***Edit your Details***");
			try{  
				Scanner scanner =new Scanner(System.in);
				Connection connection=ConnectionManager.openConnection();
				
	        	 PreparedStatement stmt=connection.prepareStatement("UPDATE MentorDetails SET first_name=?,last_name=?,dob=?,phone_number=?, email=?  Where mentor_id=? ");
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
	        	 stmt.setString(6, MentorModel.getMentorId());
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
	        	 view_Mentor_Details();
     		connection.close(); 
    	 }catch(Exception e){ System.out.println(e);} 
    	 
			MentorView.mentorProfile();
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

		
		public static void create_New_Batch() {
			System.out.println("***Create a New Batch***");
			try{  
	        	 Connection connection=ConnectionManager.openConnection();  
	        	 PreparedStatement stmt=connection.prepareStatement("insert into batch (batch_id,batch_name,batch_capacity,batch_mentor_id,batch_venue_id,batch_startDate,batch_endDate) values (?,?,?,?,?,?,?); ");
	        	 System.out.println("Enter New Batch Id: ");
	        	 String batch_id=scanner.next();
	        	 System.out.println("Enter New Batch Name: ");
	        	 String batch_Name=scanner.next();
	        	 System.out.println("Enter Capacity of Batch: ");
	        	 int batch_capacity=scanner.nextInt();
	        	 System.out.println("Enter Venue Id: ");
	        	 String venue_id=scanner.next();
	        	 System.out.println("Enter Batch Start Date: ");
	        	 String start_date=scanner.next();
	        	 System.out.println("Enter Batch End Date: ");
	        	 String end_date=scanner.next();
	        	 stmt.setString(1,batch_id);
	        	 stmt.setString(2,batch_Name );
	        	 stmt.setInt(3, batch_capacity);
	        	 stmt.setString(4, MentorModel.getMentorId());
	        	 stmt.setString(5,venue_id);
	        	 stmt.setString(6,start_date);
	        	 stmt.setString(7,end_date);
	        	 int rs=stmt.executeUpdate(); 
	        	 if(rs > 0)
	        	 {
	        		 System.out.println();
	        		 System.out.println();
	        		 System.out.println("New Lp Batch Created");
	        	 }
	        	 else
	        	 {
	        	  System.out.println("There is a problem in updating Record.");
	        	 } 
	        	 
     		connection.close(); 
    	 }catch(Exception e){ System.out.println(e);}
			MentorView.my_Lp_Batch();
			
		}
		public static void View_MyLPBatch_Details() {
				System.out.println("***My LP Batch Details***");
				try{  
		        	 Connection connection=ConnectionManager.openConnection();  
		        	 PreparedStatement stmt=connection.prepareStatement("select * from batch where batch_mentor_id=?");
		        	 stmt.setString(1, MentorModel.getMentorId());
		        	 ResultSet rs=stmt.executeQuery();  
		        	 System.out.println("--------------------");
			     		System.out.println("*****My Lp Batch Details*****");
			     		System.out.println("---------------------");
			     		while(rs.next())
			     		{
			     		System.out.println("Batch Id -:"+rs.getString(1));
			     		System.out.println("Batch Name -:" +rs.getString(2));
			     		System.out.println("Batch Capacity -:"  +rs.getInt(3));
			     		System.out.println("Batch Mentor Id-:" +rs.getString(4));
			     		System.out.println("Batch Venue Id -:"  +rs.getString(5));
			     		System.out.println("Batch Start Date -:" +rs.getDate(6));
			     		System.out.println("Batch End Date-:"  +rs.getDate(7));
			     		System.out.println("________________________");
			     		}  
			     		connection.close(); 
		        	 }catch(Exception e){ System.out.println(e);}
				MentorView.my_Lp_Batch();
			
		}
		public static void enroll_Lps() {
				System.out.println("***Enroll LPs***");
				
				MentorView.all_Lps();
			}

		public static void view_Lp_Details() {
			         System.out.println("***View Lp Details***");
			         try{  
			        	 
			        	 Connection connection=ConnectionManager.openConnection();  
			        	 java.sql.Statement stmt=connection.createStatement();  
			        	 ResultSet rs=stmt.executeQuery("select * from lpdetails"); 
			             
			     		while(rs.next())/**If Record Is Present In DataBase The Display Student Information */
			     		{
			     			System.out.println("--------------------");
				     		System.out.println("DETAILS OF LP");
				     		System.out.println("---------------------");	
			     		System.out.println("LP Id -:"+rs.getString(1));
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
			         MentorView.all_Lps();
		   }
       }
	
