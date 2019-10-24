package com.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.model.Admin;
import com.airline.repository.AdminLoginRepository;

@Service
public class AdminLoginService implements AdminLoginServiceInterface{
	
	@Autowired
	private AdminLoginRepository adminloginRepo;

	
	public Admin checkLogin(String email,String password) throws Exception{
		System.out.println("In service login");
		
		
		return adminloginRepo.checkLogin(email,password);
	

}
}
