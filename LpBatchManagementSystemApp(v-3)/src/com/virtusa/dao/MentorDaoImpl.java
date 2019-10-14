package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.virtusa.integrate.ConnectionManager;

public  class MentorDaoImpl implements MentorDAO {

	@Override
	public boolean mentorAuth(String mentorId,String mentorPassword) throws SQLException, ClassNotFoundException {
		
			Connection connection=ConnectionManager.openConnection();
			boolean flag=false;
			PreparedStatement statement = connection.prepareStatement("select mentor_id, mentor_Password from mentorLogin where mentor_Id=? and mentor_Password=?");
			statement.setString(1, mentorId);
			statement.setString(2,mentorPassword);
 			ResultSet results=statement.executeQuery();
			//ResultSet results=statement.executeQuery();
			//System.out.println(results);
			 if(results.next()) {
				ConnectionManager.closeConnection();
				 return true;
			 }else {
				// System.out.println("false");
				 return false;
			 } 
	}
			
}
