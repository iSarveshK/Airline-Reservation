package com.airline.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.airline.model.User;
@Repository
public class RegisterationRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addNewUser(User user) {
		entityManager.persist(user);       	 
	}

}
