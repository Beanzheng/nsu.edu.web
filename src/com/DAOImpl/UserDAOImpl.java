package com.DAOImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DAO.UserDAO;

public class UserDAOImpl extends AbstractDAOImpl implements UserDAO{

	public UserDAOImpl(Connection conn) {
		super(conn);
	}

	@Override
	public Boolean loginCheck(String loginName, String loginPwd) throws Exception{
		String sql="select * from user where userName=? and pwd=?";
		boolean flag=false;
		super.pstm=super.conn.prepareStatement(sql);
		super.pstm.setString(1, loginName);
		super.pstm.setString(2, loginPwd);
		ResultSet rs=super.pstm.executeQuery();
		if(rs.next()){
			System.out.println("登陆验证成功");
			return true;
		}else {
			System.out.println("登陆验证失败");
			return false;
		}
	}

	@Override
	public Boolean resigter(String loginName, String loginPwd, String Sex)
			throws Exception {
		String sql="INSERT into user(userName,pwd,sex) value(?,?,?)";
		boolean flag= false;
		super.pstm=super.conn.prepareStatement(sql);
		super.pstm.setString(1, loginName);
		super.pstm.setString(2, loginPwd);
		super.pstm.setString(3, Sex);
		if(super.pstm.executeUpdate() > 0){
			System.out.println("注册业务成功");
			flag=true;
			return flag;
		}else {
			System.out.println("注册业务失败");
			return flag;
		}
		
	}

	@Override
	public Boolean modPwd(String loginName, String loginPwd, String NewPwd)
			throws Exception {
		String sql="UPDATE user SET pwd=? WHERE userName=?";
		super.pstm= super.conn.prepareStatement(sql);
		super.pstm.setString(1, NewPwd);
		super.pstm.setString(2, loginName);
		if(super.pstm.executeUpdate() > 0){
			System.out.println("修改密码成功,dao");
			return true;
		}else {
			System.out.println("修改密码失败,dao");
			return false;
		}
	}

}
