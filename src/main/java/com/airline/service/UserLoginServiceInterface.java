package com.airline.service;

import com.airline.model.User;

public interface UserLoginServiceInterface  {
	
	public User checkLogin(String email,String password) throws Exception;

}
