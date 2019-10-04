package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.virtusa.integrate.ConnectionManager;

public class MentorDaoImpl implements MentorDAO {

	@Override
	public boolean mentorAuth(String mentorId,String mentorPassword) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	
			Connection connection=ConnectionManager.openConnection();
			boolean flag=false;
			PreparedStatement statement = connection.prepareStatement("select mentor_id, mentor_password from mentorlogin where mentor_id=? and mentor_password=?");
			statement.setString(1, mentorId);
			statement.setString(2, mentorPassword);
 			int results=statement.executeUpdate();
			//ResultSet results=statement.executeQuery();
			//System.out.println(results);
			 ConnectionManager.closeConnection();
			 if(results==1) {
				
				 return true;
			 }else {
				 //System.out.println("false");
				 return false;
			 }
	}
	
			
}
