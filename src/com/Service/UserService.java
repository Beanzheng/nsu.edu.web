package com.Service;
/**
 * ҵ���߼��ӿڹ���
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
}
