package com.airline.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.airline.model.Admin;
import com.airline.model.User;
import com.airline.service.AdminLoginService;
import com.airline.service.UserLoginService;

@Controller
public class UserLoginController {
	
	@Autowired
	private UserLoginService userloginService;
	
	@RequestMapping(path = "/user-login.airline", method = RequestMethod.POST)
	public String checkLogin(@RequestParam("email") String email, @RequestParam("password") String password,Map model) throws Exception{
		try {
		User check=userloginService.checkLogin(email, password);
		if(check != null){
			model.put("message", "login successful");
			return "welcome.jsp";
		}
		
		else{
			model.put("message", "login unsuccessful!");
			return "login.jsp";
		}
		} catch (Exception e) {
			model.put("error", e.getMessage());
			return "failure.jsp";
		}
		
	}

}
