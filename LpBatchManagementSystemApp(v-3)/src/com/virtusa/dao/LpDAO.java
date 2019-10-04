package com.virtusa.dao;

	import java.sql.SQLException;

public interface LpDAO
{
	boolean lpAuth(String lpId, String lpPassword) throws SQLException, ClassNotFoundException;		
	}
