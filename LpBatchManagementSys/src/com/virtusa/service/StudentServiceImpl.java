package com.virtusa.service;

import com.virtusa.dao.StudentDAO;
import com.virtusa.entities.Student;
import com.virtusa.entities.StudentDetails;
import com.virtusa.helper.FactoryStudentDAO;
import com.virtusa.model.StudentModel;

public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO=null;
	public StudentServiceImpl(){
		this.studentDAO=FactoryStudentDAO.createStudentDAO();
		
	}
	
	

	public boolean storeStudentService(StudentModel studentmodel) {
		// TODO Auto-generated method stub
		
		Student student=new Student();
		
		
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setFirstName(studentmodel.getFirstName());
		studentDetails.setLastName(studentmodel.getLastName());
		studentDetails.setStudentDetailsId(1);
		studentDetails.setEmail(studentmodel.getEmail());
		studentDetails.setPhoneNumber(studentmodel.getPhoneNumber());
		
		
		
		return studentDAO.persistStudent(student);
		
		
		
		
	}

	
	}


