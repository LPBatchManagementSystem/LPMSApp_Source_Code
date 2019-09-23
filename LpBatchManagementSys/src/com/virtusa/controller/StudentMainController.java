package com.virtusa.controller;

import com.virtusa.helper.FactoryStudentService;
import com.virtusa.model.StudentModel;
import com.virtusa.service.StudentService;

import com.virtusa.view.StudentView;

public class StudentMainController {

	private StudentService studentmainService;
	public StudentMainController(){
		this.studentmainService=FactoryStudentService.createStudentService();
		
	}
	
	public void storeStudent(StudentModel studentModel){
		
		boolean result=studentmainService.storeStudentService(studentModel);
		StudentView studentView=new StudentView();
		if(result){
			studentView.storeSuccessful();
		}else{
			
			studentView.storeUnSuccessful();
		}
		
	}
	
}
