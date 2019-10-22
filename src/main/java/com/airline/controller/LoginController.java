package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.Admin;
import com.lti.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(path = "/login.lti", method = RequestMethod.POST)
	public String checkLogin(@RequestParam("email") String email, @RequestParam("password") String password,Map model){
		boolean flag=false;
		boolean check=false;
		try{
			flag=loginService.checkLogin(email, password);
			check=loginService.checkLogin(email, password);
		}
		catch(Exception e){
			
		}
			
		
		Admin check=loginService.checkLogin(email,password);
		if(check != null){
			model.put("message", "login successful");
			return "welcome.jsp";
		}
		else{
			model.put("message", "login unsuccessful!");
			return "login.jsp";
		}
	
		
	}
                    
}
