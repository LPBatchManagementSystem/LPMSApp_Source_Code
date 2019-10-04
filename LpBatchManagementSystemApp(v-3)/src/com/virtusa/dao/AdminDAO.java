package com.virtusa.dao;

	import java.sql.SQLException;

	import com.virtusa.entities.Admin;
	import com.virtusa.model.AdminModel;

public interface AdminDAO
{


	boolean adminAuth(String adminId, String adminPassword) throws SQLException, ClassNotFoundException;

		
	}

