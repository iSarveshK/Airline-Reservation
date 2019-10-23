package com.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.model.Admin;
import com.airline.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepo;

	
	public Admin checkLogin(String email,String password) throws Exception{
		System.out.println("In service login");
		
		
		return loginRepo.checkLogin(email,password);
	

}
}
