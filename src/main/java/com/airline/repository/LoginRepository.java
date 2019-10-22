package com.airline.dao;

import javax.annotation.Resource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.airline.entity.Admin;

@Repository
public class LoginRepository implements LoginInterface {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	

public Admin checkLogin(String email,String password) {
	
		System.out.println("Checking login credentials");
		String sql= "select a from Admin a where a.email=:id and a.password=:password";
		Query q = entityManager.createQuery(sql);
		q.setParameter("id", email);
		q.setParameter("password", password);
		return (Admin) q.getSingleResult();
		
	}






}
