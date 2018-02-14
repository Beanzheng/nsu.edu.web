package com.Factory;

import com.Service.UserService;
import com.ServiceImpl.UserServiceImpl;

public class ServiceFactory {
	public UserService getUserServiceInstace() {
		return new UserServiceImpl();
	}
}
