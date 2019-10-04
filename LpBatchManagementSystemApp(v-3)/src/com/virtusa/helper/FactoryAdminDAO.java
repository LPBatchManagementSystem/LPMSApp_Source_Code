
package com.virtusa.helper;

import com.virtusa.dao.AdminDAO;
import com.virtusa.dao.AdminDaoImpl;

public class FactoryAdminDAO {
	
	public static AdminDAO createAdminDAO() {
		
		AdminDAO adminDAO=new AdminDaoImpl();
		
		return adminDAO;
		
		
	}
}
