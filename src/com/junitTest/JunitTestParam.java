package com.junitTest;

import java.sql.Connection;
import java.sql.Statement;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.DAO.UserDAO;
import com.DAOImpl.UserDAOImpl;
import com.DatabaseConnection.DBConection;
import com.Service.UserService;
import com.ServiceImpl.UserServiceImpl;

public class JunitTestParam {
	private static DBConection db= new DBConection();
	private static UserDAO dao= null;
	private static UserService service=null;
	@BeforeClass
	public static void beforeclassA() throws Exception{
		Connection conn = db.getConn();
		dao=new UserDAOImpl(conn);
		service=new UserServiceImpl();
		Statement sm = conn.createStatement();
	}
	@Test
	public void TestDaoImpl() throws Exception{
		String loginName="user";
		String loginPwd="ss";
		Assert.assertTrue(dao.loginCheck(loginName, loginPwd));
	}
	@Test
	public void TestServiceImpl() throws Exception{
		String loginName="user";
		String loginPwd="ss";
		Assert.assertTrue(service.loginCheck(loginName, loginPwd));
	}
}
