package com.virtusa;

import java.util.Scanner;

import com.virtusa.view.AdminView;
import com.virtusa.view.LpView;
import com.virtusa.view.MentorView;

public class Main {
	static int role;
	public static void main(String[] args) { 
		while(true)
		{
			try {
		System.out.println("*******Plese Select Role******");
		System.out.println("1.Admin");
		System.out.println("2.Mentor");
		System.out.println("3.Lp");
		Scanner scanner =new Scanner(System.in);
		role=scanner.nextInt();
		switch(role) 
		{
		case 1:AdminView.adminMenu();
		break;
		case 2:MentorView.mentorMenu();
		break;
		case 3:LpView.lpMenu();
			break;
			default:System.out.println("Please Select valid Role");
		}
			}
		catch (Exception ex) {
            System.err.println("Oops! We have detected an issue.");
            System.err.println("Please try again.");
        }
		}
		

	}

}
