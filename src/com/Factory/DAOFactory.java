package com.Factory;

import java.sql.Connection;

import com.DAO.MovieDAO;
import com.DAO.UserDAO;
import com.DAOImpl.MovieDAOImpl;
import com.DAOImpl.UserDAOImpl;

public class DAOFactory {
	public static UserDAO getUserDaoInstance(Connection conn){
		return new UserDAOImpl(conn);
	}
	public static MovieDAO getMovieDaoInstance(Connection conn){
		return new MovieDAOImpl(conn);
	}
}
