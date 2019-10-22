package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.Login1Daoimpl;
import com.lti.entity.Admin;

@Service
public class LoginService {
	
	@Autowired
	private Login1Daoimpl logindao;

	
	public Admin checkLogin(String email,String password){
		System.out.println("In service login");
		
		
		return logindao.checkLogin(email,password);
	
		
	}
	
	
	
}
