package com.airline.dao;

import com.airline.entity.Admin;

public interface LoginInterface {
	
	public Admin checkLogin(String email,String password);
	
}
