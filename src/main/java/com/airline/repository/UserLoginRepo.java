package com.airline.repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.airline.model.User;

@Repository
public class UserLoginRepo   {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	
	public User checkLogin(String email,String password) {
		try{
		System.out.println("Checking login credentials");
		String sql= "select u from User u where u.email=:id and u.password=:password";
		Query q = entityManager.createQuery(sql);
		q.setParameter("id", email);
		q.setParameter("password", password);
		return (User) q.getSingleResult();
		}
		catch(NoResultException e){
			System.out.println("No record catch exception");
			throw e;
		}
	}

}
