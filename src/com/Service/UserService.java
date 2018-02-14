package com.Service;
/**
 * 业务逻辑接口管理
 * @author admisnwl
 *
 */
public interface UserService {
	/**
	 * 
	 * @param loginName
	 * @param loginPwd
	 * @return true/false
	 * @throws Exception
	 */
	public boolean loginCheck(String loginName,String loginPwd) throws Exception;
	/**
	 * 
	 * @param loginName
	 * @param loginPwd
	 * @param Sex
	 * @return
	 * @throws Exception
	 */
	public boolean resigter(String loginName,String loginPwd,String Sex) throws Exception;
}
