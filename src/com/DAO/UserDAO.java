package com.DAO;
/**
 * �ײ����ݹ���ӿ�
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
}
