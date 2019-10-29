package com.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.airline.model.User;



//@Service
public class MailService {
	

	@Autowired  //dependency injection
	private MailSender mailSender;
	
	
	@Autowired
	private SimpleMailMessage message;
	
	public void send(User user) {
		message.setTo(user.getEmail()); 
		message.setSubject("Registration Successful!");
		message.setText("Thank You for registering with us");
		mailSender.send(message);
	}
}



