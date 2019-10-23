package com.airline.repository;

import com.airline.model.Admin;

public interface LoginInterface {
	
	public Admin checkLogin(String email,String password);

}
