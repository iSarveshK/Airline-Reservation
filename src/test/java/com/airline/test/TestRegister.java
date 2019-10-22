package com.airline.test;



import com.airline.model.User;
import com.airline.service.UserService;

public class TestRegister {

	
	//@Test
	public void checkUser(){
		
		User u = new User();
		u.setFirstName("Kashika");
		u.setLastName("tyagi");
		u.setEmail("kash@lti.com");
		u.setPassword("abc");
		u.setPhone(87933637);
		
		UserService service = new UserService();
		service.register(u);
		
	}
	
}
