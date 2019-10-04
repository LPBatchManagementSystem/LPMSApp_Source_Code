package com.virtusa.dao;

import java.sql.SQLException;

public interface MentorDAO {

	boolean mentorAuth(String mentorId, String mentorPassword) throws SQLException, ClassNotFoundException;

}
