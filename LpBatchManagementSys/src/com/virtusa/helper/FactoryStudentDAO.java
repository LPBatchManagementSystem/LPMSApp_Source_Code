package com.virtusa.helper;


import com.virtusa.dao.StudentDAO;
import com.virtusa.dao.StudentDAOImpl;

public class FactoryStudentDAO {
	
	public static StudentDAO createStudentDAO(){
		
		StudentDAO studentDAO=new StudentDAOImpl();
		return studentDAO;
		
	}
}
