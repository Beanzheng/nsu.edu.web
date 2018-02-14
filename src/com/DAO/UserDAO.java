package com.DAO;
/**
 * 底层数据管理接口
 * @author admisnwl
 *
 */
public interface UserDAO {
	/**
	 * 
	 * @param loginName
	 * @param loginPwd
	 * @return  true/false
	 */
	public Boolean loginCheck(String loginName,String loginPwd) throws Exception;
	/**
	 * 
	 * @param loginName
	 * @param loginPwd
	 * @param Sex
	 * @return
	 * @throws Exception
	 */
	public Boolean resigter(String loginName,String loginPwd,String Sex) throws Exception;
	/**
	 * 
	 * @param loginName
	 * @param loginPwd
	 * @param oldPwd
	 * @return
	 * @throws Exception
	 */
	public Boolean modPwd(String loginName,String loginPwd,String NewPwd) throws Exception;
	
}
