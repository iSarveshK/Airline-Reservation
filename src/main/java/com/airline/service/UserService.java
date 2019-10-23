package com.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airline.model.User;
import com.airline.repository.RegisterationRepository;

@Service
public class UserService {

		@Autowired
		private RegisterationRepository registerationRepository;
		
		@Autowired
		private MailService mailService;

		public void register(User user){
			registerationRepository.addNewUser(user);	
			mailService.send(user); //sends mail (business logic)
		}
	}


