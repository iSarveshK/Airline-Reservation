package com.airline.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airline.model.User;
@Repository
public class RegisterationRepository implements RegisterRepositoryInterface  {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void addNewUser(User user) {
		user.setSecurityQuestionUser("some question");
		entityManager.persist(user);
		System.out.println("user added successfully");
	}

}
