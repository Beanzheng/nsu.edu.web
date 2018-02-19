package com.DAO;

import java.sql.Array;
import java.util.List;

import com.ORM.Movie;

/**
 * ��Ӱ�ײ������߼��ӿڹ���
 */
public interface MovieDAO {
	/**
	 * ��������
	 * @param movieName
	 * @return	true/false
	 * @throws Exception
	 */
	public boolean seaMovie(String movieName) throws Exception;
	/**
	 * ���������г���Ӱ
	 * @param movieType
	 * @return	list
	 * @throws Exception
	 */
	public List<Movie> accordType(String movieType) throws Exception;
	/**
	 * ���ݵ�Ӱ�����г���Ӱ��ϸ
	 * @return 
	 * @throws Exception
	 */
	public List<Movie> listMovieDetail(String movieName) throws Exception;
}
