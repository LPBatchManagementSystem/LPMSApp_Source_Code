package com.virtusa.dao;

import com.virtusa.entities.Student;
import com.virtusa.repository.StudentRepository;

public class StudentDAOImpl implements StudentDAO{
	public boolean persistStudent(Student student) {
		// TODO Auto-generated method stub
		return StudentRepository.add(student);
		
	}

}
