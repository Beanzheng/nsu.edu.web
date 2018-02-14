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
			System.out.println("��½��֤�ɹ�");
			return true;
		}else {
			System.out.println("��½��֤ʧ��");
			return false;
		}
	}

}
