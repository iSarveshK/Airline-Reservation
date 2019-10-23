package com.airline.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.airline.model.Admin;
import com.airline.service.AdminLoginService;


@Controller
public class AdminLoginController {
	

	@Autowired
	private AdminLoginService adminloginService;
	
	@RequestMapping(path = "/login.airline", method = RequestMethod.POST)
	public String checkLogin(@RequestParam("email") String email, @RequestParam("password") String password,Map model) throws Exception{
		try {
		Admin check=adminloginService.checkLogin(email, password);
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


