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
import com.airline.service.AdminLoginService;


@Controller
@SessionAttributes("admin")
public class AdminLoginController {
	

	@Autowired
	private AdminLoginService adminloginService;
	
	@RequestMapping(path = "/login.airline", method = RequestMethod.POST)
	public String checkLogin(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap model) throws Exception{
		try {
		Admin check=adminloginService.checkLogin(email, password);
		if(check != null){
			model.addAttribute("admin",check);
			return "UserSearchFlight.jsp";
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
	//logout
	@RequestMapping(path="/admin-logout.airline",method=RequestMethod.POST)
	public String logout(ModelMap model,HttpSession session){
		model.clear();
		session.invalidate();
		return "redirect:/Userlogin.jsp";
	}
}


