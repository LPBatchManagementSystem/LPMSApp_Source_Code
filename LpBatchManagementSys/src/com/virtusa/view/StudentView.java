package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.StudentMainController;
import com.virtusa.model.StudentModel;

public class StudentView {
	public void mainStudentView() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Update Details");
		System.out.println("2. View Calendar");
		System.out.print("Enter option:");
		int option=scanner.nextInt();
		StudentView studentView=new StudentView();

		if(option==1){
		StudentView.registerStudentForm();
	
		}
		
	}
	
	public static void registerStudentForm(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Student Roll No");
		int rollNo=scanner.nextInt();
		
		System.out.print("Student FirstName:");
		String firstName=scanner.next();
		
		System.out.print("Student LastName:");
		String lastName=scanner.next();
		
		System.out.print("Student Email:");
		String email=scanner.next();
		

		System.out.print("Student PhoneNumber:");
		String phoneNumber=scanner.next();
		
		
		System.out.print("Course Id:");
		int courseId=scanner.nextInt();
		
		StudentModel studentModel=new StudentModel();
		studentModel.setCourseId(courseId);
		studentModel.setEmail(email);
		studentModel.setFirstName(firstName);
		studentModel.setLastName(lastName);
		studentModel.setRollNo(rollNo);
		studentModel.setPhoneNumber(phoneNumber);
		
		StudentMainController studentmainController=new StudentMainController();
		studentmainController.storeStudent(studentModel);
		
	}
	
	
	public void storeSuccessful(){
		
		System.out.println("Student registered successful");
	}
	
    public void storeUnSuccessful(){
		
		System.out.println("Student registered unsuccessful");
	}
    
    
    
}
