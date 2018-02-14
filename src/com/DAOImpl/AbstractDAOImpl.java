package com.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;


public abstract class AbstractDAOImpl {
	
		protected Connection conn;
		protected PreparedStatement psta;
		public PreparedStatement pstm;
		
		public AbstractDAOImpl(Connection conn){
			this.conn=conn;
		}
	}


