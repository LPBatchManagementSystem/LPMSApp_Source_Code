package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.virtusa.integrate.ConnectionManager;

public  class AdminDaoImpl implements AdminDAO {

	@Override
	public boolean adminAuth(String adminId,String adminPassword) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//System.out.println(adminId);
		//System.out.println(adminPassword);
			Connection connection=ConnectionManager.openConnection();
			boolean flag=false;
			PreparedStatement statement = connection.prepareStatement("select admin_id, admin_Password from adminLogin where admin_Id=? and admin_Password=?");
			statement.setString(1, adminId);
			statement.setString(2, adminPassword);
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

