package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.virtusa.integrate.ConnectionManager;

public  class LpDaoImpl implements LpDAO {

	@Override
	public boolean lpAuth(String lpId,String lpPassword) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//System.out.println(adminId);
		//System.out.println(adminPassword);
			Connection connection=ConnectionManager.openConnection();
			boolean flag=false;
			PreparedStatement statement = connection.prepareStatement("select lp_id, lp_Password from lpLogin where lp_Id=? and lp_Password=?");
			statement.setString(1, lpId);
			statement.setString(2, lpPassword);
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