package com.virtusa.repository;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Student;



public class StudentRepository {
private static List<Student> students=new ArrayList<Student>();
	
	public static boolean add(Student student){
		return students.add(student);
	}
	
	public static List<Student> get(){
		return students;
	}
}
