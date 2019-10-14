package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.virtusa.integrate.ConnectionManager;

public  class LpDaoImpl implements LpDAO {

	@Override
	public boolean lpAuth(String lpId,String lpPassword) throws SQLException, ClassNotFoundException {
			Connection connection=ConnectionManager.openConnection();
			boolean flag=false;
			PreparedStatement statement = connection.prepareStatement("select lp_id, lp_Password from lpLogin where lp_Id=? and lp_Password=?");
			statement.setString(1, lpId);
			statement.setString(2, lpPassword);
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