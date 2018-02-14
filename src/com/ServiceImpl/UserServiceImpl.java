package com.ServiceImpl;

import java.sql.Connection;

import com.DAO.UserDAO;
import com.DatabaseConnection.DBConection;
import com.Factory.DAOFactory;
import com.Service.UserService;

public class UserServiceImpl implements UserService{
	private DBConection dbc=  new DBConection();
	@Override
	public boolean loginCheck(String loginName, String loginPwd)
			throws Exception {
		if (DAOFactory.getUserDaoInstance((Connection)
				this.dbc.getConn()).loginCheck(loginName, loginPwd)) {
			System.out.println("µÇÂ½ÒµÎñÂß¼­³É¹¦");
			return true;
		}else {
			System.out.println("µÇÂ½ÒµÎñÂß¼­Ê§°Ü");
			return false;
		}
	}

}
