package com.virtusa.helper;

import com.virtusa.dao.LpDAO;
import com.virtusa.dao.LpDaoImpl;

public class FactoryLpDAO {

	public static LpDAO createLpDAO() {
		LpDAO lpDAO=new LpDaoImpl();
		return lpDAO;
	}

}
