package com.Factory;

import java.sql.Connection;

import com.DAO.UserDAO;
import com.DAOImpl.UserDAOImpl;

public class DAOFactory {
	public static UserDAO getUserDaoInstance(Connection conn){
		return new UserDAOImpl(conn);
	}
}
