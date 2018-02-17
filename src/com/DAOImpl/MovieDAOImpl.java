package com.DAOImpl;

import java.sql.Connection;
import java.sql.ResultSet;
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
		
		return null;
	}

	@Override
	public List<Movie> listMovieDetail(String movieName) throws Exception {
		
		return null;
	}

}
