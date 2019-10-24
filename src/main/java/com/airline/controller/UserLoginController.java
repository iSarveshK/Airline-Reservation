package com.airline.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.airline.model.Admin;
import com.airline.model.User;
import com.airline.service.AdminLoginService;
import com.airline.service.UserLoginService;

@Controller
@SessionAttributes("userLogin")

public class UserLoginController {
	
	@Autowired
	private UserLoginService userloginService;
	
	@RequestMapping(path = "/user-login.airline", method = RequestMethod.POST)
	public String checkLogin(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap modelMap) throws Exception{
		try {
		User check=userloginService.checkLogin(email, password);
		if(check != null){
		
			modelMap.addAttribute("userLogin",check);
			return "redirect:/UserSearchFlight.jsp";
		}
	
		else{
			modelMap.put("message", "login unsuccessful!");
			return "UserLogin.jsp";
		}
		} catch (Exception e) {
			modelMap.put("error", e.getMessage());
			return "failure.jsp";
		}
	}
	
	@RequestMapping(path="/user-logout.airline",method=RequestMethod.POST)
	public String logout(ModelMap model,HttpSession session){
		model.clear();
		session.invalidate();
		return "redirect:/login.jsp";
	}
		
	}


