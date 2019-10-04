package com.virtusa.helper;

import com.virtusa.dao.MentorDAO;
import com.virtusa.dao.MentorDaoImpl;

public class FactoryMentorDAO {

	public static MentorDAO createMentorDAO() {
		MentorDAO mentorDAO=new MentorDaoImpl();
		return mentorDAO;
	}

}

