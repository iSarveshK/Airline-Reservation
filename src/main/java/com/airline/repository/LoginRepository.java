package com.airline.repository;


import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.airline.model.Admin;

@Repository
public class LoginRepository implements LoginInterface{
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	
	
	public Admin checkLogin(String email,String password) {
		try{
		System.out.println("Checking login credentials");
		String sql= "select a from Admin a where a.email=:id and a.password=:password";
		Query q = entityManager.createQuery(sql);
		q.setParameter("id", email);
		q.setParameter("password", password);
		return (Admin) q.getSingleResult();
		}
		catch(NoResultException e){
			System.out.println("No record catch exception");
			throw e;
		}
	}

}
