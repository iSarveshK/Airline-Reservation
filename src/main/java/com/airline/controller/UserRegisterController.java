package com.airline.controller;
import java.time.LocalDate;
import java.util.Map;

import javax.security.auth.login.FailedLoginException;

import org.apache.catalina.startup.FailedContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.airline.dto.UserDto;
import com.airline.model.User;
import com.airline.service.UserService;

@Controller
@SessionAttributes("user")
public class UserRegisterController {

	@Autowired
	private UserService userRegisterService;
	
	@RequestMapping(path ="/register.airline", method = RequestMethod.POST)
	public String register(UserDto dto, ModelMap model){

		
		User user1 = new User();
		user1.setFirstName(dto.getFirstName());
		user1.setLastName(dto.getLastName());
		user1.setEmail(dto.getEmail());
		user1.setPassword(dto.getFpassword());
		user1.setDateOfBirth(LocalDate.parse(dto.getDateOfBirth()));
		user1.setPhone(dto.getPhone());
		user1.setSecurityQuestionUser(dto.getSecurityQuestionUser());
		user1.setSecurityAnswerUser(dto.getSecurityAnswerUser());
		

		userRegisterService.register(user1);
		
		model.addAttribute("user", user1);
		return "redirect:/showDashBoard.airline"; 
		
	
		}
		@RequestMapping("/showDashBoard.airline")
		public String showDashBoard(ModelMap model){
			if(model.containsAttribute("user")){
				return "welcome.jsp";
			}
		return "redirect:/loginUser.airline";
	}	
	
		
		
	}
	