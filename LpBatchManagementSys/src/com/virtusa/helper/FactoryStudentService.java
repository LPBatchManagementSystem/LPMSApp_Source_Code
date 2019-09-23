package com.virtusa.helper;

import com.virtusa.service.StudentService;
import com.virtusa.service.StudentServiceImpl;

public class FactoryStudentService {
public static StudentService createStudentService(){
		
		StudentService studentService=new StudentServiceImpl();
		return studentService;
	}


}
