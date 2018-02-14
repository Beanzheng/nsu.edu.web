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
			System.out.println("��½ҵ���߼��ɹ�");
			return true;
		}else {
			System.out.println("��½ҵ���߼�ʧ��");
			return false;
		}
	}
	@Override
	public boolean resigter(String loginName, String loginPwd, String Sex)
			throws Exception {
		if(DAOFactory.getUserDaoInstance((Connection)
				this.dbc.getConn()).resigter(loginName, loginPwd, Sex)){
			System.out.println("ע��ҵ���߼��ɹ�");
			return true;
		}else {
			System.out.println("ע��ҵ���߼��ɹ�");
			return false;
		}
	}

}
