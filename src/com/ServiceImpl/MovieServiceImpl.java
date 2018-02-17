package com.ServiceImpl;

import java.sql.Connection;
import java.util.List;

import com.DAO.MovieDAO;
import com.DatabaseConnection.DBConection;
import com.Factory.DAOFactory;
import com.ORM.Movie;
import com.Service.MovieService;

public class MovieServiceImpl implements MovieService{
	private DBConection dbc=  new DBConection();
	@Override
	public boolean seaMovie(String movieName) throws Exception {
		if(DAOFactory.getMovieDaoInstance((Connection)
				this.dbc.getConn()).seaMovie(movieName)){
			System.out.println(movieName+"查询成功");
			return true;
		}else {
			System.out.println(movieName+"查询失败");
			return false;
		}
	}

	@Override
	public List<Movie> accordType(String movieType) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> listMovieDetail(String movieName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
