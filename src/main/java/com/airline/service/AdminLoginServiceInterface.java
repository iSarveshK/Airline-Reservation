package com.airline.service;

import com.airline.model.Admin;
import com.airline.model.User;

public interface AdminLoginServiceInterface {
	
	public Admin checkLogin(String email,String password) throws Exception;
		
	
	
	

}
