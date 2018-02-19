package com.DAOImpl;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.DAO.MovieDAO;
import com.ORM.Movie;

public class MovieDAOImpl extends AbstractDAOImpl implements MovieDAO{

	public MovieDAOImpl(Connection conn) {
		super(conn);
		
	}

	@Override
	public boolean seaMovie(String movieName) throws Exception {
		String sql="SELECT * from movie where mName LIKE ?";
		boolean flag=false;
		String string="%";
		String string2="%";
		movieName=string+movieName+string2;
		super.pstm=super.conn.prepareStatement(sql);
		super.pstm.setString(1, movieName);
		ResultSet rs=super.pstm.executeQuery();
		if (rs.next()) {
			for(int i=1;i<=10;i++)
				System.out.print(rs.getObject(i)+"\n");
			flag=true;
			System.out.println(movieName+",查询成功");
			return flag;
		}else {
			System.out.println(movieName+",查询失败");
			return flag;
		}
	}

	@Override
	public List<Movie> accordType(String movieType) throws Exception {
		String sql="select mName,type from movie where type Like ?";
		String string="%";
		String string2="%";
		movieType=string+movieType+string2;
		List list1=new ArrayList();
		super.pstm=super.conn.prepareStatement(sql);
		super.pstm.setString(1, movieType);
		ResultSet rs=super.pstm.executeQuery();
		while(rs.next()){
			for (int i = 1; i < 3; i++) {
				//System.out.print(rs.getObject(i)+"\n");
				list1.add(rs.getObject(i));			
			}
		}
		for(Object ojb : list1){
			System.out.println(ojb);
		}
		return list1;
	}

	@Override
	public List<Movie> listMovieDetail(String movieName) throws Exception {
		String sql="select * from movie where mName=?";
		super.pstm=super.conn.prepareStatement(sql);
		super.pstm.setString(1, movieName);
		ResultSet rs= super.pstm.executeQuery();
		List list1=new ArrayList();
		while(rs.next()){
			for(int i=1; i<10; i++){
				//System.out.println(rs.getObject(i)+"\n");
				list1.add(rs.getObject(i));
			}
		}
		for(Object obj: list1){
			System.out.println(obj);
		}
		return list1;
	}

}
