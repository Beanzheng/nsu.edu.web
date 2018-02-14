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
			System.out.println("登陆业务逻辑成功");
			return true;
		}else {
			System.out.println("登陆业务逻辑失败");
			return false;
		}
	}
	@Override
	public boolean resigter(String loginName, String loginPwd, String Sex)
			throws Exception {
		if(DAOFactory.getUserDaoInstance((Connection)
				this.dbc.getConn()).resigter(loginName, loginPwd, Sex)){
			System.out.println("注册业务逻辑成功");
			return true;
		}else {
			System.out.println("注册业务逻辑成功");
			return false;
		}
	}

}
