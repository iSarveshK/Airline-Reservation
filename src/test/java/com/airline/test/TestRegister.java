package com.airline.test;



import java.time.LocalDate;

import org.junit.Test;

import com.airline.model.User;
import com.airline.service.UserService;

public class TestRegister {

	
	@Test
	public void checkUser(){
		
		User u = new User();
		u.setFirstName("Maujrul");
		u.setLastName("Ansari");
		u.setEmail("majrul@lti.com");
		u.setPassword("maj@12K");
		u.setSecurityAnswerUser("oreo");
		u.setPhone(2136652326);
		u.setDateOfBirth(LocalDate.now());
		
		UserService service = new UserService();
		service.register(u);
		
	}
	
}
