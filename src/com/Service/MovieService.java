package com.Service;

import java.util.List;

import com.ORM.Movie;

/**
 * ҵ���߼�����ӿ�
 */
public interface MovieService {
	/**
	 * 
	 * @param movieName
	 * @return
	 * @throws Exception
	 */
	public boolean seaMovie(String movieName) throws Exception;
	/**
	 * 
	 * @param movieType
	 * @return
	 * @throws Exception
	 */
	public List<Movie> accordType(String movieType) throws Exception;
	/**
	 * 
	 * @param movieName
	 * @return
	 * @throws Exception
	 */
	public List<Movie> listMovieDetail(String movieName) throws Exception;
}
