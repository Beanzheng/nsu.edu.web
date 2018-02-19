package com.DAO;

import java.sql.Array;
import java.util.List;

import com.ORM.Movie;

/**
 * 电影底层数据逻辑接口管理
 */
public interface MovieDAO {
	/**
	 * 搜索功能
	 * @param movieName
	 * @return	true/false
	 * @throws Exception
	 */
	public boolean seaMovie(String movieName) throws Exception;
	/**
	 * 根据类型列出电影
	 * @param movieType
	 * @return	list
	 * @throws Exception
	 */
	public List<Movie> accordType(String movieType) throws Exception;
	/**
	 * 根据电影名罗列出电影详细
	 * @return 
	 * @throws Exception
	 */
	public List<Movie> listMovieDetail(String movieName) throws Exception;
}
