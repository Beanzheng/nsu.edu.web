package com.junitTest;

import java.sql.Connection;
import java.sql.Statement;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.DAO.MovieDAO;
import com.DAO.UserDAO;
import com.DAOImpl.MovieDAOImpl;
import com.DAOImpl.UserDAOImpl;
import com.DatabaseConnection.DBConection;
import com.Service.MovieService;
import com.Service.UserService;
import com.ServiceImpl.MovieServiceImpl;
import com.ServiceImpl.UserServiceImpl;

public class JunitTestParam {
	private static DBConection db= new DBConection();
	private static UserDAO dao= null;
	private static UserService service=null;
	private static MovieDAO mdao=null;
	private static MovieService mservice=null;
	@BeforeClass
	public static void beforeclassA() throws Exception{
		Connection conn = db.getConn();
		dao=new UserDAOImpl(conn);
		service=new UserServiceImpl();
		Statement sm = conn.createStatement();
		mdao=new MovieDAOImpl(conn);
		mservice=new MovieServiceImpl();
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
	@Test
	public void TestResigterDao() throws Exception{
		String loginName="funcking";
		String loginPwd="qwewss";
		String Sex="ÄÐ";
		dao.resigter(loginName, loginPwd, Sex);
	}
	@Test
	public void TestResigterService() throws Exception{
		String loginName="hello";
		String loginPwd="qwes";
		String Sex="Å®";
		Assert.assertTrue(service.resigter(loginName, loginPwd, Sex));
	}
	@Test
	public void TestmodPwdDao() throws Exception{
		String loginName="funcking";
		String loginPwd="qwewss";
		String NewPwd="123456";
		Assert.assertTrue(dao.modPwd(loginName, loginPwd, NewPwd));

	}
	@Test
	public void TestmodPwdService() throws Exception{
		String loginName="hello";
		String loginPwd="1234";
		String NewPwd="12345";
		Assert.assertTrue(service.modPwd(loginName, loginPwd, NewPwd));
	}
	@Test
	public void TestMovieSeaDao() throws Exception{
		String movieName="ÓÂ";
		Assert.assertTrue(mdao.seaMovie(movieName));
	}
	@Test
	public void TestMovieSeaService() throws Exception{
		String movieName="ÓÂ";
		Assert.assertTrue(mservice.seaMovie(movieName));
	}
}
