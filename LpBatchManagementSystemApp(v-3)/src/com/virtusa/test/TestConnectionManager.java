package com.virtusa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.virtusa.integrate.ConnectionManager;

class TestConnectionManager {

	@Test
	void testOpenConnection_positive() {
		try {
			Connection connection=ConnectionManager.
					openConnection();
			assertEquals(true,connection!=null);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			assertTrue(false);
		}
	
	}
}
