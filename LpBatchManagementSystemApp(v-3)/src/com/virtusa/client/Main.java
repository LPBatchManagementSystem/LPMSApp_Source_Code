package com.virtusa.client;

import java.util.Scanner;

import com.virtusa.view.LoginView;

public class Main {
	static int role;
	static int cmd;
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		menu();
	}
    public static void menu() {
    	
		try {
			System.out.println();
			System.out.println();
			System.out.println("Welcome to LP Batch Management System Application");
			System.out.println("  ---------**********Login***********--------- ");
			System.out.println();
			try {
				Thread.sleep(500);
		System.out.println("*******Please Select Anyone Option******");
		System.out.println("1.Admin Login ");
		System.out.println("2.Mentor Login");
		System.out.println("3.Lp Login");
		System.out.println("0.Exit");
		role=scanner.nextInt();
		switch(role) 
		{
		default:System.out.println("*************Please Select valid Role**************");
		System.out.println();
		System.out.println();
		menu();
		case 1:LoginView.adminLogin();
		break;
		case 2:LoginView.mentorLogin();
		break;
		case 3:LoginView.lpLogin();
			break;
			
			case 0:exit();
			break;
		}
			}
		catch (Exception ex) {
	        System.err.println("Oops! We have detected an issue.");
	        System.err.println("**************Please try again*****************");
	        
	    }
			menu();
			
			}catch (Exception ex) {
	            System.err.println("Oops! We have detected an issue.");
	            ex.getMessage();
	            System.err.println("******************Please try again***************");}
		}
    
    private static void exit() {
        System.out.println("See you!");
        System.exit(0);
	}
}


