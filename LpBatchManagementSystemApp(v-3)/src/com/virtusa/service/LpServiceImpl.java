package com.virtusa.service;

import java.sql.SQLException;
import com.virtusa.dao.LpDAO;
import com.virtusa.helper.FactoryLpDAO;
import com.virtusa.model.LpModel;

public class LpServiceImpl implements LpService {
	
	LpDAO lpDAO=null;
	
	public LpServiceImpl(){
		
		this.lpDAO=FactoryLpDAO.createLpDAO();
		}
	@Override
	public boolean lpAuthenticationService(LpModel lpModel) 
	{
		boolean lpValid = false;
		try {
			lpValid=lpDAO.lpAuth(lpModel.getLpId(),lpModel.getLpPassword());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lpValid;
	}
}