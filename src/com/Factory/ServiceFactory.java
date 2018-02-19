package com.Factory;

import com.Service.MovieService;
import com.Service.UserService;
import com.ServiceImpl.MovieServiceImpl;
import com.ServiceImpl.UserServiceImpl;

public class ServiceFactory {
	public static UserService getUserServiceInstace() {
		return new UserServiceImpl();
	}
	public static MovieService getMovieServiceInstance(){
		return new MovieServiceImpl();
	}
}
