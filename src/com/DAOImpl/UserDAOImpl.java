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

}
