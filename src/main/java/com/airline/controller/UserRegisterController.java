package com.airline.controller;
import java.time.LocalDate;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.airline.dto.UserDto;
import com.airline.model.User;
import com.airline.service.UserService;

@Controller
public class UserRegisterController {

	@Autowired
	private UserService userRegisterService;
	
	@RequestMapping(path ="/register.airline", method = RequestMethod.POST)
	public String register(UserDto dto, Map Model){

		
		User user1 = new User();
		user1.setFirstName(dto.getFirstName());
		user1.setLastName(dto.getLastName());
		user1.setEmail(dto.getEmail());
		user1.setPassword(dto.getPassword());
		user1.setDateOfBirth(LocalDate.parse(dto.getDateOfBirth()));
		user1.setPhone(dto.getPhone());
		user1.setSecurityQuestionUser(dto.getSecurityQuestionUser());
		user1.setSecurityAnswerUser(dto.getSecurityAnswerUser());

		userRegisterService.register(user1);
		
		
		 return "Confirmation.jsp";
		
		
	}	
	
		
		
	}
	