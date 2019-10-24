package com.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.model.Admin;
import com.airline.model.User;
import com.airline.repository.AdminLoginRepository;
import com.airline.repository.UserLoginRepo;
@Service
public class UserLoginService implements  UserLoginServiceInterface{
	

	@Autowired
	private UserLoginRepo userloginRepo;

	//user class
	public User checkLogin(String email,String password) throws Exception{
		System.out.println("In service login");
		
		
		return userloginRepo.checkLogin(email,password);
		
	

}
}
